grammar My;

options {
  language = Java;
}

@header {
  package study.antlr.first;
  import java.util.*;
  import org.antlr.runtime.BitSet;
}

@lexer::header {
  package study.antlr.first;
}

@parser::members {
  public Hashtable results = new Hashtable();
}

rule: (element)+;

NAME: (('a'..'z')|('A'..'Z'))
 (('a'..'z')|('A'..'Z')|('0'..'9'))*
  ;

NUM: ('0'..'9')+;


WS : (' '|'\t'|'\n')+ {$channel = HIDDEN;};

element:
  NAME NUM
{
  results.put($NAME.text, $NUM.text);
}
  ;