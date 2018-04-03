grammar Expr;		
prog:	(expr NEWLINE)* ;
expr:	expr '*' expr       # multExpr
    |   expr '/' expr       # divExpr
    |	expr '+' expr       # addExpr
    |   expr '-' expr       # subExpr
    |	INT                 # intExpr
    |	'(' expr ')'        # bracketExpr
    ;
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;
