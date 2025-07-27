grammar Lordescript;

prog:
	'Caro' 'compilador' COMMA block? 'Assinado' 'com' 'distinção' COMMA 'Lordescript';

block: (cmd)+;

cmd: cmdRead | cmdLogic | cmdWrite | cmd_assign | if_stmt;

cmdRead:
	'Ordeno' 'que' 'mostre' 'ao' 'mundo' 'o' 'valor de' ID SEMICOLON;

cmdWrite: ESCREVO ID SEMICOLON;
ESCREVO: 'Escrevo' 'humildemente' 'o' 'valor' 'de';
cmd_assign:
	'Declaro' 'que' 'o' type ID SERA 'agraciado' 'com' 'o' 'valor' VALUE SEMICOLON;
SERA: 'será';

cmdLogic: (ID | VALUE) COMPARE (ID | VALUE);

COMMENT: '/*' .*? '*/' -> skip;

// if statement
if_stmt:
	'Se' 'porventura' cmdLogic COMMA 'logo' COLON block (
		elif_stmt
	)* (else_stmt)? 'Assim' 'finaliza-se' 'a' HIPOTESE DOT;
HIPOTESE: 'hipótese';

elif_stmt:
	'Contudo' COMMA 'se' cmdLogic COMMA 'logo' COLON block;

else_stmt: 'Caso' CONTRARIO COLON block;
CONTRARIO: 'contrário';

LOGO: 'logo';

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
DUAL: 'dual';
PERGAMINHO: 'pergaminho';
INTEIRO: 'inteiro';
FRACIONARIO: 'fracionário';
CAPITULAR: 'capitular';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

VALUE: EXPR | STRING | BOOL | FLOAT | INTEGER;

STRING: '"' (~["\r\n])* '"';

BOOL: 'digno' | 'indigno';

INTEGER: [0-9]+;

FLOAT: [0-9]+ ('.' [0-9]+)?;

EXPR: T PLUS EXPR | T MINUS EXPR | T;
T: F MULT T | F DIV T | F;
F: ABRE_P EXPR FECHA_P | FLOAT | ID;

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

WS: [ \t\r\n]+ -> skip;