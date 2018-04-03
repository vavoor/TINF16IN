grammar Pipifax;

program
    : (var_decl | fn_def)*
    ;
    
var_decl
    : 'var' Identifier type
    ;
    
fn_def
    : 'fn' Identifier '(' param_decls? ')' type? block
    ;
    
param_decls
    : param_decl (',' param_decl)*
    ;
    
param_decl
    : Identifier param_type
    ;
    
type
    : 'int'
    | 'double'
    | 'string'
    | '[' Integer ']' type
    ;
    
param_type
    : type
    | '*' type
    | '*' '[' ']' type
    ;
    
block
    : '{' (stmt | var_decl)* '}'
    ;
    
stmt
    : if_stmt
    | while_stmt
    | fn_call_stmt
    | assignment
    ;
    
if_stmt
    : 'if' expr block
    | 'if' expr block 'else' block
    ;
    
while_stmt
    : 'while' expr block
    ;
    
fn_call_stmt
    : fn_call
    ;
    
assignment
    : lvalue '=' expr
    ;
    
lvalue
    : Identifier
    | lvalue '[' expr ']'
    ;
    
expr
    : Integer
    | Double
    | String
    | lvalue
    | fn_call
    | '(' expr ')'
    | '-' expr
    | '!' expr
    | '(' 'int' ')'
    | '(' 'double' ')'
    | expr '*' expr
    | expr '/' expr
    | expr '+' expr
    | expr '-' expr
    | expr '<' expr
    | expr '>' expr
    | expr '<=' expr
    | expr '>=' expr
    | expr '<=>' expr
    | expr '==' expr
    | expr '!=' expr
    | expr '&&' expr
    | expr '||' expr
    ;
    
fn_call
    : Identifier '(' args? ')'
    ;
    
args
    : expr (',' expr)*
    ;

fragment
Letter
    : [A-Za-z_]
    ;
    
fragment
Digit0
    : [0-9]
    ;
    
fragment
Digit1
    : [1-9]
    ;
    
Identifier
    : Letter (Letter|Digit0)*
    ;
    
Integer
    : Digit1 Digit0* | '0'
    ;

fragment
Exp
    : [eE] ('+'|'-')? Integer
    ;
    
Double
    : Integer ('.' Integer)? Exp?
    ;
    
String
    : '"' ~["]* '"'
    ;
    
Comment
    : '#' ~[\n]* [\n] -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
