grammar Mxs;
/*
options{
    output=AST;
    ASTLabelType=CommonTree;
    language=Java;
}*/

//parser
compilationUnit : (defunc | defvars | defclass)* EOF;

varname : ID;                                           //variable name

defvars : type varname ('=' expr)? ';';                                   //define variables

defvar : type varname ('=' expr)?;                      //variable define with type

type : (basetype | typename | arraytype);

typename : ID;                                          //type of variable

arraytype : (basetype | typename) ('[' ']')*;           //type of array

basetype : ('int' | 'bool' | 'void' | 'string');        //base type

classname : ID;                                         //class type

defclass : 'class' classname '{'                        //define class
    (//func = ID '(' ')' block |
    defunc
    | defvars
    )* '}';

funcname : ID;                                          //function name

defunc : type funcname '(' params ')' block;            //define function

params : (param (',' param)*)?;                         //list of parameters

param : defvar;                                         //parameter

block : '{' stmt* '}';                                  //block of codes

stmt : block                                            #blockStmt//statement
    | op = 'if' '(' expr ')' stmt ('else' stmt)?            #ifStmt//if
    | op ='for' '(' start = expr? ';'
                    condition = expr? ';'
                    update = expr? ')' stmt                 #forStmt//for
    | op = 'while' '(' expr? ')' stmt                       #whileStmt//while
    | op = 'return' expr? ';'                               #returnStmt//return
    | 'break' ';'                                           #breakStmt//break
    | 'continue' ';'                                        #continueStmt//continue
    | defvars                                               #varDeclStmt//variable definition
    | ';'                                                   #emptyStmt//empty statement
    | expr ';'                                              #exprStmt//statement with only expression
    ;

exprs : expr (',' expr)*;                                //list of expressions


expr : funcname '(' exprs? ')'                          #callExpr//expression
    | 'new' news                                            #newExpr//new
    | expr '[' expr ']'                                     #arrayExpr//array
        | op = '(' expr ')'  #subExpr//expression with parentheses
//    | expr op = '.' expr                                    //option of iterator
    | expr '.' (ID | functionCall)                          #memberExpr
    | op = ('++' | '--') expr                               #prefixExpr//++num or --num
    | expr op = ('++' | '--')                               #suffixExpr//num++ or num--
    | op = ('-' | '!' | '~') expr                           #prefixExpr//
    | expr op = ('*' | '/' | '%') expr                      #binaryExpr//mult or div or mod
    | expr op = ('+' | '-') expr                            #binaryExpr// add or sub
    | expr op = ('<<' | '>>') expr                          #binaryExpr//read or write
    | expr op = '&' expr                                    #binaryExpr//and
    | expr op = '^' expr                                    #binaryExpr//xor
    | expr op = '|' expr                                    #binaryExpr//or
    | expr op = ('>' | '<' | '>=' | '<=' | '==' | '!=') expr#binaryExpr//logical comparison
    | expr op = '&&' expr                                   #andExpr//and
    | expr op = '||' expr                                   #orExpr//or
//    | expr '?' expr ':' expr                                //other king of if
    | varname                                               #idExpr//variable name
    | NUM                                                   #intConstExpr//num
   // |'0'                                                    #intConstExpr
    | STR                                                   #stringConstExpr//string
    | 'null'                                                #nullExpr//null
    | TRUE                 #boolConstExpr//true or false
    | FALSE                 #boolConstExpr
    | <assoc=right> expr op = '=' expr                      #assignExpr//evaluation
    | 'this'                                                #thisExpr//this
    ;

news : (classname | basetype) ('[' expr ']')* ('[' ']')+ ('[' expr ']')+ #wrongNew
    | (classname | basetype) ('[' expr ']')+ ('[' ']')*     #arrayNew
    | (classname | basetype) ('(' exprs ')')?                  #nonArrayNew
    ;

functionCall : funcname '(' exprs? ')';

//lexer
                          //identifier

STR : '"' ('\\"' | '\\\\'|.)*? '"' ;                    //string

NUM :  [1-9] [0-9]* | '0' ;                    //number

WS : ( ' ' | '\t' | '\n' | '\r' ) + -> skip;            //whitespace

LINE_COMMENT : '//' ~[\r\n]* -> skip;                   //comment

BLOCK_COMMENT : '/*' .*? '*/' -> skip;

TRUE : 'true' | 'TRUE';

FALSE : 'false' | 'FALSE';

ID : [a-zA-Z] [a-zA-Z_0-9]*;


