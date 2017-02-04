grammar My;

options {
  language = Java;
}

@header {
  package study.antlr.first;
}

@lexer::header {
  package study.antlr.first;
}

rule: element+;

NAME: (('a'..'z')|('A'..'Z'))
 (('a'..'z')|('A'..'Z')|('0'..'9'))*
  ;

NUM: ('0'..'9')+;


WS : (' '|'\t'|'\n')+ {$channel = HIDDEN;};

element:
  NAME | NUM
  ;