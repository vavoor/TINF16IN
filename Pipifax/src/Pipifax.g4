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
    : Identifier type
    ;
    
type
    : 'int'                     # intType
    | 'double'                  # doubleType
    | 'string'                  # stringType
    | '[' Integer ']' type      # arrayType
    | '*' type                  # referenceType
    | '*' '[' ']' type          # arrayRefType
    ;
    
block
    : '{' (stmt | var_decl)* '}'
    ;
    
stmt
    : if_stmt                   # ifStmt
    | while_stmt                # whileStmt
    | fn_call_stmt              # callStmt
    | assignment                # assignStmt
    | block                     # blockStmt
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
    : Integer                   # intLiteral
    | Double                    # doubleLiteral
    | String                    # stringLiteral
    | lvalue                    # lvalExpr
    | fn_call                   # callExpr
    | '(' expr ')'              # bracketExpr
    | '-' expr                  # negExpr
    | '!' expr                  # notExpr
    | '(' 'int' ')' expr        # intCastExpr
    | '(' 'double' ')' expr     # doubleCastExpr
    | expr '*' expr             # multExpr
    | expr '/' expr             # divExpr
    | expr '+' expr             # addExpr
    | expr '-' expr             # subExpr
    | expr '<' expr             # lessExpr
    | expr '>' expr             # greaterExpr
    | expr '<=' expr            # lessEqualExpr
    | expr '>=' expr            # greaterEqualExpr
    | expr '<=>' expr           # compExpr
    | expr '==' expr            # equalExpr
    | expr '!=' expr            # notEqualExpr
    | expr '&&' expr            # andExpr
    | expr '||' expr            # orExpr
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
