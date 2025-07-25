grammar Lordescript;

prog:
	'Caro compilador,\n\n' BLOCK 'Assinado com distinção,\nLordescript';

BLOCK: (CMD)+;

CMD: CMD_READ | CMD_COMPARE | CMD_WRITE | CMD_ASSIGN | IF;

// if statement
IF:
	'Se porventura ' { System.out.println("IF");} CMD_COMPARE ', então:' BLOCK (
		ELIF
	)* (ELSE)?;

ELIF: 'Porém, se ' CMD_COMPARE ', então:' BLOCK;

ELSE: 'Caso contrário:' BLOCK;

// while statement
WHILE:
	'Enquanto ' CMD_COMPARE ', então:' BLOCK 'e repita até que a condição não seja mais verdadeira;'
		;

DO_WHILE:
	'Seria conveniente que as seguintes medidas sejam tomadas:' BLOCK 'Enquanto ' CMD_COMPARE;

CMD_COMPARE: (ID | VALUE) COMPARE (ID | VALUE);

COMPARE:
	'revelar-se como maior que'
	| 'revelar-se como menor que'
	| 'revelar-se como igual a';

CMD_READ: 'Ordeno que mostre ao mundo o valor de ' ID ';';

CMD_WRITE: 'Escrevo com elegância o valor de ' ID ';';

CMD_ASSIGN:
	'Declaro que o ' TYPE ' ' ID ' é agraciado com o valor ' VALUE ';';

TYPE:
	'dual'
	| 'pergaminho'
	| 'numérico'
	| 'fracional'
	| 'capitular';

ID: [a-z]([a-z] | [A-Z] | [0-9])*;

VALUE: NUMBER | STRING | BOOL;

STRING: '"' (~["\r\n])* '"';

BOOL: 'digno' | 'indigno';

NUMBER: [0-9]+ ('.' [0-9]+)?;

WS: (' ' | '\t' | '\n' | '\r')+ -> skip;