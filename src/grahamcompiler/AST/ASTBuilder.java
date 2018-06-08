package grahamcompiler.AST;

import Parser.MxsParser;
import Parser.MxsBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ErrorNode;
import grahamcompiler.AST.node.DeclNode.*;
import grahamcompiler.AST.node.ExprNode.*;
import grahamcompiler.AST.node.StmtNode.*;
import grahamcompiler.AST.object.FuncDeclObject;
import grahamcompiler.AST.object.ParameterObject;
import grahamcompiler.AST.node.ProgNode;
import grahamcompiler.AST.object.VarObject;
import grahamcompiler.Type.*;
import grahamcompiler.utility.location;
import grahamcompiler.utility.UnaryOp;
import grahamcompiler.utility.BinaryOp;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class ASTBuilder extends MxsBaseListener{
    private ProgNode program;
    private ParseTreeProperty<Object> map = new ParseTreeProperty<>();
    public ASTBuilder() {}
    public ProgNode getProgram() {
        return program;
}
    @Override
    public void exitCompilationUnit(MxsParser.CompilationUnitContext ctx) {
        List<DeclNode> declNodes = new LinkedList<>();
        for (ParserRuleContext parserRuleContext : ctx.getRuleContexts(ParserRuleContext.class)) {
            DeclNode node = (DeclNode) map.get(parserRuleContext);
            declNodes.add(node);
        }
        program = new ProgNode(new location(ctx.getStart().getLine(), 0), declNodes);
    }
    @Override
    public void exitDefclass(MxsParser.DefclassContext ctx) {
        List<VarDeclNode> varDecNodes = new ArrayList<>();
        List<FuncDeclNode> funcDecNodes = new ArrayList<>();
        for (MxsParser.DefvarsContext item : ctx.defvars()) {
            varDecNodes.add((VarDeclNode) map.get(item));
        }
        for (MxsParser.DefuncContext item : ctx.defunc()) {
            funcDecNodes.add((FuncDeclNode) map.get(item));
        }
        location pos = new location(ctx.getStart().getLine(), 0);
        ClassType type = new ClassType(ctx.classname().getText(), 4);
        ClassDeclNode class_node = new ClassDeclNode(pos, type, funcDecNodes, varDecNodes);
        map.put(ctx, class_node);
    }
    @Override
    public void exitDefunc(MxsParser.DefuncContext ctx) {
        List<FuncParamNode> paras = new ArrayList<>();
        if(ctx.params() != null) {
            for (MxsParser.ParamContext item : ctx.params().param()) {
                paras.add((FuncParamNode)map.get(item));
            }
        }
        BlockNode blockNode = (BlockNode) map.get(ctx.block());
        location pos = new location(ctx.getStart().getLine(),0);
        Type ret_type;
        FuncDeclObject func;
        if(ctx.type() != null) {
            ret_type = (Type)map.get(ctx.type());
            func = new FuncDeclObject(ctx.funcname().ID().getText(), paras, ret_type);
        }
        else {
            ret_type = new Type(ctx.funcname().getText(), 4);
            func = new FuncDeclObject(ctx.funcname().ID().getText(), paras, ret_type, true);
        }
        FuncDeclNode funcDecNode = new FuncDeclNode(pos, func, blockNode);
        map.put(ctx, funcDecNode);
    }
    @Override
    public void exitDefvars(MxsParser.DefvarsContext ctx) {
        location pos = new location(ctx.getStart().getLine(), 0);
        int dimension = getBracketNumber(ctx.getText());
        Type type = (Type)map.get(ctx.type());
        String id = ctx.varname().getText();
        ExprNode expr = (ExprNode) map.get(ctx.expr());
        VarObject varObject = new VarObject(id, false, type);
        VarDeclNode varDecNode = new VarDeclNode(pos, varObject, expr);
        map.put(ctx, varDecNode);
    }
    @Override
    public void exitParam(MxsParser.ParamContext ctx) {
        map.put(ctx, new FuncParamNode(new location(ctx.getStart().getLine(), 0),
                new ParameterObject(ctx.defvar().varname().getText(), (Type) map.get(ctx.defvar().type()))));
    }
    @Override
    public void exitBasetype(MxsParser.BasetypeContext ctx) {
        BuiltInType type;
        switch (ctx.getText()) {
            case "bool":
                type = new BuiltInType("bool", 1);
                break;
            case "int":
                type = new BuiltInType("int", 4);
                break;
            case "void":
                type = new BuiltInType("void", 0);
                break;
            case "string":
                type = new BuiltInType("string", 0);
                break;
            default:
                throw new InternalError(ctx.getText() + "is an invalid type");
        }
        map.put(ctx, type);
    }
    @Override
    public void exitTypename(MxsParser.TypenameContext ctx) {
        ClassType type = new ClassType(ctx.getText(), 4);
        map.put(ctx, type);
    }
    @Override
    public void exitArraytype(MxsParser.ArraytypeContext ctx) {
        Type baseType;
        ArrayType arrayType;
        int dimension = getBracketNumber(ctx.getText());
        if (ctx.basetype() != null) {
            baseType = (Type) map.get(ctx.basetype());
            arrayType = new ArrayType(ctx.basetype().getText(), dimension, baseType);
        }
        else {
            baseType = new ClassType(ctx.typename().ID().getText(), 4);
            arrayType = new ArrayType(ctx.typename().ID().getText(), dimension, baseType);
        }
        map.put(ctx, arrayType);
    }
    @Override
    public void exitType(MxsParser.TypeContext ctx) {
        Type type;
        if (ctx.basetype() != null)
            type = (BuiltInType) map.get(ctx.basetype());
        else if (ctx.typename() != null)
            type = (ClassType) map.get(ctx.typename());
        else type = (ArrayType) map.get(ctx.arraytype());
        map.put(ctx, type);
    }
    @Override
    public void exitBlock(MxsParser.BlockContext ctx) {
        List<StmtNode> statNodes = new ArrayList<>();
        for (MxsParser.StmtContext item : ctx.stmt()) {
            StmtNode stat = (StmtNode) map.get(item);
            if (stat != null)
                statNodes.add(stat);
        }
        BlockNode blockNode = new BlockNode(new location(ctx.getStart().getLine(), 0), statNodes);
        map.put(ctx, blockNode);
    }

    @Override
    public void exitBlockStmt(MxsParser.BlockStmtContext ctx) {
        map.put(ctx, map.get(ctx.block()));
    }

    @Override
    public void exitVarDeclStmt(MxsParser.VarDeclStmtContext ctx) {
        map.put(ctx, map.get(ctx.defvars()));
    }

    @Override
    public void exitIfStmt(MxsParser.IfStmtContext ctx) {
        IfNode ifNode = new IfNode(new location(ctx.getStart().getLine(), 0), getExpr(ctx.expr()),
                getStmt(ctx.stmt(0)), getStmt(ctx.stmt(1)));
        map.put(ctx, ifNode);
    }

    @Override public void exitForStmt(MxsParser.ForStmtContext ctx) {
        ForNode forNode = new ForNode(new location(ctx.getStart().getLine(), 0), getExpr(ctx.start),
                getExpr(ctx.condition), getExpr(ctx.update), getStmt(ctx.stmt()));
        map.put(ctx, forNode);
    }

    @Override
    public void exitWhileStmt(MxsParser.WhileStmtContext ctx) {
        WhileNode whileNode = new WhileNode(new location(ctx.getStart().getLine(), 0), getExpr(ctx.expr()),
                getStmt(ctx.stmt()));
        map.put(ctx, whileNode);
    }

    @Override
    public void exitReturnStmt(MxsParser.ReturnStmtContext ctx) {
        ReturnNode returnNode;
        if (ctx.expr() != null) {
            returnNode = new ReturnNode(new location(ctx.getStart().getLine(), 0), getExpr(ctx.expr()));
        } else {
            returnNode = new ReturnNode(new location(ctx.getStart().getLine(), 0), null);
        }
        map.put(ctx, returnNode);
    }

    @Override
    public void exitBreakStmt(MxsParser.BreakStmtContext ctx) {
        BreakNode breakNode = new BreakNode(new location(ctx.getStart().getLine(), 0));
        map.put(ctx, breakNode);
    }

    @Override
    public void exitContinueStmt(MxsParser.ContinueStmtContext ctx) {
        ContinueNode continueNode = new ContinueNode(new location(ctx.getStart().getLine(), 0));
        map.put(ctx, continueNode);
    }

    @Override
    public void exitExprStmt(MxsParser.ExprStmtContext ctx) {
        ExprStmtNode exprStatNode = new ExprStmtNode(new location(ctx.getStart().getLine(), 0), (ExprNode) map.get(ctx.expr()));
        map.put(ctx, exprStatNode);
    }
    @Override
    public void exitExprs(MxsParser.ExprsContext ctx) {
        List<ExprNode> exprNodes = new ArrayList<>();
        for (MxsParser.ExprContext item : ctx.expr()) {
            exprNodes.add((ExprNode) map.get(item));
        }
        ExprListNode exprListNode = new ExprListNode(new location(ctx.getStart().getLine(), 0), exprNodes);
        map.put(ctx, exprListNode);
    }
    @Override
    public void exitNewExpr(MxsParser.NewExprContext ctx) {
        CreatorExprNode creatorNode = (CreatorExprNode)map.get(ctx.news());
        map.put(ctx, new NewExprNode(new location(ctx.getStart().getLine(), 0), creatorNode));
    }
    @Override
    public void exitWrongNew(MxsParser.WrongNewContext ctx) {
        throw new RuntimeException("wrong construction of array");
    }
    @Override
    public void exitArrayNew(MxsParser.ArrayNewContext ctx) {
        Type type;
        if(ctx.classname() != null)
            type = (Type)map.get(ctx.classname());
        else type = (Type)map.get(ctx.basetype());
        List<ExprNode> exprs = new LinkedList<>();
        for(MxsParser.ExprContext item : ctx.expr())
            exprs.add((ExprNode)map.get(item));
        int dimension = getBracketNumber(ctx.getText());
        map.put(ctx ,new CreatorExprNode(new location(ctx.getStart().getLine(), 0), type, exprs, dimension));
    }
    @Override
    public void exitNonArrayNew(MxsParser.NonArrayNewContext ctx) {
 /*       Type type;
        if (ctx.classname() != null) {
            type = new Type(ctx.classname().ID().getText(),1);
        }
        else type = new Type(ctx.classname().getText(),1);*/
        Type type = new Type(ctx.classname().ID().getText(),1);
        map.put(ctx, new CreatorExprNode(new location(ctx.getStart().getLine(), 0), type, new ArrayList<>(), 0));
    }
    @Override
    public void exitBoolConstExpr(MxsParser.BoolConstExprContext ctx) {
        boolean value = ctx.getText() == "true";
        BoolConstNode node = new BoolConstNode(new location(ctx.getStart().getLine(), 0), value);
        map.put(ctx, node);
    }
    @Override
    public void exitIntConstExpr(MxsParser.IntConstExprContext ctx) {
        int value = Integer.valueOf(ctx.getText());
        IntConstNode intConstNode = new IntConstNode(new location(ctx.getStart().getLine(), 0), value);
        map.put(ctx, intConstNode);
    }
    @Override
    public void exitStringConstExpr(MxsParser.StringConstExprContext ctx) {
        String value = ctx.getText().substring(1,ctx.getText().length() - 1);
        map.put(ctx, new StringConstNode(new location(ctx.getStart().getLine(), 0), value));
    }
    @Override
    public void exitSubExpr(MxsParser.SubExprContext ctx) {
        map.put(ctx, getExpr(ctx.expr()));
    }
    @Override
    public void exitThisExpr(MxsParser.ThisExprContext ctx) {
        ThisExprNode thisExprNode = new ThisExprNode(new location(ctx.getStart().getLine(), 0), "this");
        map.put(ctx, thisExprNode);
    }
    @Override
    public void exitNullExpr(MxsParser.NullExprContext ctx) {
        NullConstNode nullConstNode = new NullConstNode(new location(ctx.getStart().getLine(), 0));
        map.put(ctx, nullConstNode);
    }
    @Override
    public void exitArrayExpr(MxsParser.ArrayExprContext ctx) {
        ArrayExprNode arrayExprNode = new ArrayExprNode(new location(ctx.getStart().getLine(), 0),
                getExpr(ctx.expr(0)),
                getExpr(ctx.expr(1)));
        map.put(ctx, arrayExprNode);
    }
    @Override
    public void exitMemberExpr(MxsParser.MemberExprContext ctx) {
        MemberExprNode memberExprNode;
        if(ctx.functionCall() != null)
            memberExprNode = new MemberExprNode(new location(ctx.getStart().getLine(), 0),
                    getExpr(ctx.expr()), (CallExprNode)map.get(ctx.functionCall()));
        else
            memberExprNode = new MemberExprNode(new location(ctx.getStart().getLine(), 0),
                    getExpr(ctx.expr()), ctx.ID().getText());
        map.put(ctx, memberExprNode);
    }
    @Override
    public void exitPrefixExpr(MxsParser.PrefixExprContext ctx) {
        UnaryOp op;
        switch (ctx.op.getText()) {
            case "++":
                op = UnaryOp.INC;
                break;
            case "--":
                op = UnaryOp.DEC;
                break;
            case "~":
                op = UnaryOp.BIT_NOT;
                break;
            case "!":
                op = UnaryOp.NOT;
                break;
            case "+":
                op = UnaryOp.POS;
                break;
            case "-":
                op = UnaryOp.NEG;
                break;
            default:
                throw new InternalError("Invalid prefix op" + ctx.op.getText());
        }
        PrefixExprNode prefixExprNode = new PrefixExprNode(new location(ctx.getStart().getLine(), 0),
                op, (ExprNode) map.get(ctx.expr()));
        map.put(ctx, prefixExprNode);
    }
    @Override
    public void exitSuffixExpr(MxsParser.SuffixExprContext ctx) {
        UnaryOp op;
        switch (ctx.op.getText()) {
            case "++":
                op = UnaryOp.SUF_INC;
                break;
            case "--":
                op = UnaryOp.SUF_DEC;
                break;
            default:
                throw new InternalError("Invalid suffix op" + ctx.op.getText());
        }
        SuffixExprNode suffixExprNode = new SuffixExprNode(new location(ctx.getStart().getLine(), 0), op,
                (ExprNode) map.get(ctx.expr()));
        map.put(ctx, suffixExprNode);
    }
    @Override
    public void exitBinaryExpr(MxsParser.BinaryExprContext ctx) {
        BinaryOp op;
        if(ctx.op == null)
            System.out.println(1);
        switch (ctx.op.getText()) {
            case "+":
                op = BinaryOp.ADD;
                break;
            case "-":
                op = BinaryOp.MIN;
                break;
            case "*":
                op = BinaryOp.MUL;
                break;
            case "/":
                op = BinaryOp.DIV;
                break;
            case "%":
                op = BinaryOp.MOD;
                break;
            case "&":
                op = BinaryOp.BIT_AND;
                break;
            case "^":
                op = BinaryOp.BIT_XOR;
                break;
            case "|":
                op = BinaryOp.BIT_OR;
                break;
            case ">>":
                op = BinaryOp.R_SHIFT;
                break;
            case "<<":
                op = BinaryOp.L_SHIFT;
                break;
            case "<":
                op = BinaryOp.SLT;
                break;
            case "<=":
                op = BinaryOp.SEQ;
                break;
            case ">":
                op = BinaryOp.SGT;
                break;
            case ">=":
                op = BinaryOp.BEQ;
                break;
            case "==":
                op = BinaryOp.EQU;
                break;
            case "!=":
                op = BinaryOp.NEQ;
                break;
            default:
                throw new InternalError("Invalid binary op" + ctx.op.getText());
        }
        BinaryExprNode node = new BinaryExprNode(new location(ctx.getStart().getLine(), 0),
                getExpr(ctx.expr(0)), getExpr(ctx.expr(1)), op);
        map.put(ctx, node);
    }
    @Override
    public void exitCallExpr(MxsParser.CallExprContext ctx) {
        List<ExprNode> params = new ArrayList<>();
        if(ctx.exprs() != null) {
            for (MxsParser.ExprContext item : ctx.exprs().expr()) {
                params.add((ExprNode) map.get(item));
            }
        }
        map.put(ctx, new CallExprNode(new location(ctx.getStart().getLine(), 0), ctx.funcname().getText(),
                new ExprListNode(new location(ctx.getStart().getLine(), 0), params)));
    }
    @Override
    public void exitFunctionCall(MxsParser.FunctionCallContext ctx)
    {
        List<ExprNode> params = new ArrayList<>();
        if(ctx.exprs() != null)
        {
            for (MxsParser.ExprContext item : ctx.exprs().expr())
            {
                params.add((ExprNode) map.get(item));
            }
        }
        map.put(ctx, new CallExprNode(new location(ctx.getStart().getLine(), 0), ctx.funcname().getText(),
                new ExprListNode(new location(ctx.getStart().getLine(), 0), params)));
    }
    @Override
    public void exitOrExpr(MxsParser.OrExprContext ctx) {
        map.put(ctx, new OrExprNode(new location(ctx.getStart().getLine(), 0), getExpr(ctx.expr(0)),
                getExpr(ctx.expr(1))));
    }
    @Override
    public void exitAndExpr(MxsParser.AndExprContext ctx) {
        map.put(ctx, new AndExprNode(new location(ctx.getStart().getLine(), 0), getExpr(ctx.expr(0)),
                getExpr(ctx.expr(1))));
    }
    @Override
    public void exitAssignExpr(MxsParser.AssignExprContext ctx) {
        map.put(ctx, new AssignExprNode(new location(ctx.getStart().getLine(), 0), getExpr(ctx.expr(0)),
                getExpr(ctx.expr(1))));
    }
    @Override
    public void exitIdExpr(MxsParser.IdExprContext ctx) {
        map.put(ctx, new IdentifierExprNode(new location(ctx.getStart().getLine(), 0), ctx.getText()));
    }
    @Override public void visitErrorNode(ErrorNode node) {
        throw new RuntimeException(node.getText());
    }

    private ExprNode getExpr(MxsParser.ExprContext ctx) {
        if (ctx == null) return null; else return (ExprNode) map.get(ctx);
    }
    private StmtNode getStmt(MxsParser.StmtContext ctx) {
        if (ctx == null) return null; else return (StmtNode) map.get(ctx);
    }
    private int getBracketNumber(String s) {
        int num = 0;
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == '[')
                ++num;
        }
        return num;
    }
}
