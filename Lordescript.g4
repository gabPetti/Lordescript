grammar Lordescript;

// tokens
DUAL: 'dual';
PERGAMINHO: 'pergaminho';
INTEIRO: 'inteiro';
FRACIONARIO: 'fracionário';
CAPITULAR: 'capitular';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
ABRE_P: '(';
FECHA_P: ')';
SEMICOLON: ';';
COLON: ':';
COMMA: ',';
DOT: '.';
STRING: '"' (~["\\\r\n] | '\\' . | [áéíóúãõâêôç])* '"';
BOOL: 'digno' | 'indigno';
FLOAT: [0-9]+ '.' [0-9]+;
INTEGER: [0-9]+;

// nullable tokens
WS: [ \t\r\n]+ -> skip;

// parser rules
prog:
	'Caro' 'compilador' COMMA block? 'Assinado' 'com' 'distinção' COMMA 'Lordescript' EOF;

block: (cmd)+;

cmd: cmdRead | cmdLogic | cmdWrite | cmd_assign | if_stmt;

cmdRead:
	'Ordeno' 'que' 'mostre' 'ao' 'mundo' 'o' 'valor de' (ID | STRING) SEMICOLON;

cmdWrite:
	'Escrevo' 'humildemente' 'o' 'valor' 'de' (ID | STRING) SEMICOLON;

/*
cmd_assign:
	'Declaro' 'que' 'o' type ID SERA 'agraciado' 'com' 'o' 'valor' value SEMICOLON;
*/
cmd_assign:
    'Declaro' 'que' 'o' type ID SERA 'agraciado' 'com' 'o' 'valor' expr SEMICOLON;
SERA: 'será';

//cmdLogic: (ID | value) COMPARE (ID | value);
cmdLogic: (ID | expr) COMPARE (ID | expr);

COMMENT: '/*' .*? '*/' -> skip;

// if else statement
if_stmt:
    'Se' 'porventura' cmdLogic 'logo' COLON block
    (elif_stmt)* (else_stmt)?
    (else_stmt)?
    'Assim' 'finaliza-se' 'a' HIPOTESE DOT;
HIPOTESE: 'hipótese';

elif_stmt:
    'Porém' 'se' cmdLogic 'logo' COLON block;

else_stmt: 'Caso' CONTRARIO COLON block;
CONTRARIO: 'contrário';

// while statement
while:
	'Enquanto' cmdLogic ', logo:' block 'e repita até que a condição não seja mais verdadeira;';

do_while:
	'Seria conveniente que as seguintes medidas sejam tomadas:' block 'Enquanto ' cmdLogic;

COMPARE:
	'revelar-se como maior que'
	| 'revelar-se como menor que'
	| 'revelar-se como igual a';

type: DUAL | PERGAMINHO | INTEIRO | FRACIONARIO | CAPITULAR;

value: expr | STRING | BOOL | FLOAT | INTEGER;

expr: expr_mult PLUS expr | expr_mult MINUS expr | expr_mult;

expr_mult:
	expr_sum MULT expr_mult
	| expr_sum DIV expr_mult
	| expr_sum;
expr_sum: ABRE_P expr FECHA_P | FLOAT | INTEGER | ID;

