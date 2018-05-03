tree grammar ExprEval;
options {
    tokenVocab=ExprTree; //指定符号表文件ExprTree.tokens
    ASTLabelType=CommonTree;
    language=Java;
}

@header {import java.util.HashMap;}

@members { HashMap memory = new HashMap();}

prog: stat+ ;

stat: expr {System.out.println($expr.value);}
    | ^('=' ID expr) {memory.put($ID.text, $expr.value);}
    ;

expr returns [int value]
    : ^('+' a=expr b=expr) {$value = a+b;}
    | ^('-' a=expr b=expr) {$value = a-b;}
    | ^('*' a=expr b=expr) {$value = a*b;}
    | ID
    {
        $value = 0;
        Integer v = (Integer)memory.get($ID.text);
        if ( v!=null ) $value = v.intValue();
        else System.err.println("#ff0000 variable "+$ID.text);

    }
    | INT {$value = Integer.parseInt($INT.text);}
;