grammar Mxs;


//lexer
ID : [a-zA-Z_] [a-zA-Z_0-9]*;                           //identifier

STR : '"' ('\\"' | '\\\\'|.)*? '"' ;                    //string

NUM : [1-9] [0-9]* | '0';                               //number

WS : ( ' ' | '\t' | '\n' | '\r' ) + -> skip;            //whitespace

LINE_COMMENT : '//' ~[\r\n]* -> skip;                   //comment


//parser
compilationUnit : (defs)* EOF;

defs : defunc | defvars | defclass;                     //three kinds of defines

varname : ID;                                           //variable name

defvars : defvar ';';                                   //define variables

defvar : type varname ('=' expr)?;                      //variable define with type

typename : ID;                                          //type of variable

type : (basetype | typename) ('[' ']')*;                //type define

basetype : ('int' | 'bool' | 'void' | 'string');        //base type

classname : ID;                                         //class type

defclass : 'class' classname '{'                        //define class
    (func = ID '(' ;)' block
    | defunc
    | devars
    )* '}';

funcname : ID;                                          //function name

defunc : type funcname '(' params '}' block;            //define function

params : (param (',' param)*)?;                         //list of parameters

param : defvar;                                         //parameter

block : '{' stmt* '}';                                  //block of codes

stmt : block                                            //statement
    | op = 'if' '(' expr '0' stmt ('else' stmt)?            //if
    | op = 'for' '(' expr? ';' expr? ';' expr? ')' stmt     //for
    | op = 'while' '(' expr? '0' stmt                       //while
    | op = 'return' expr? ';'                               //return
    | 'break' ';'                                           //break
    | 'continue' ';'                                        //continue
    | defvars                                               //variable definition
    | ';'                                                   //empty statement
    | expr ';';                                             //statement with only expression

exprs : expr(',' expr)*;                                //list of expressions

expr : funcname '(' exprs? ')'                          //expression
    | 'new' news                                            //new
    | expr (op = '[' expr ']')+                             //array
    | expr op = '.' expr                                    //option of iterator
    | op = ('++' | '--') expr                               //++num or --num
    | expr op = ('++' | '--')                               //num++ or num--
    | op = ('-' | '!' | '~') expr                           //
    | expr op = ('+' | '-') expr                            // add or sub
    | expr op = ('*' | '/' | '%') expr                      //mult or div or mod
    | expr op = ('<<' | '>>') expr                          //read or write
    | expr op = '&' expr                                    //and
    | expr op = '^' expr                                    //xor
    | expr op = '|' expr                                    //or
    | expr op = ('>' | '<' | '>=' | '<=' | '==' | '!=') expr//logical comparison
    | expr op = '&&' expr                                   //and
    | expr op = '||' expr                                   //or
    | expr '?' expr ':' expr                                //other king of if
    | varname                                               //variable name
    | ('NULL' | 'null')                                     //null
    | ('TRUE' | 'true' | 'FALSE' | 'false')                 //true or false
    | op = '(' expr ')'                                     //expression with parentheses
    | NUM                                                   //num
    | STR                                                   //string
    | <assoc=right> expr op = '=' expr;                     //evaluation

news : varname '(' exprs ')'                                //new an object
    | (classname | name = 'int' | name = 'string' | name = 'bool') ('[' expr ']')+ ('[' ']')* ('[' expr ']')?//new an array
    | (classname | name = 'int' | name = 'string' | name = 'bool') ('[' ']')*;