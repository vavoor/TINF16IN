grammar Selector;

mail_selector
	: field_selector+
	| common_selector+
	;

field_selector
	: 'From' ':' words
	| 'To' ':' words
	| 'Subject' ':' words
	| 'Body' ':' words
	;
	
words
	: Word (',' Word)*
	;
	
common_selector
	: Word (',' Word)*
	;

Word
	: [0-9A-Za-z_]+
	;

WS
	: [ \t\n\r]+ -> skip
	;
