grammar XL;

options {
  language = Java;
}

@header {
  package com.javadude.antlr3x.tutorial;
}


@lexer::header {
  package com.javadude.antlr3x.tutorial;
}

rule: IDENT+;

IDENT : 'a'..'z'+;
WS : ' '+ {$channel = HIDDEN;};