grammar Hello;

WS: [\t]+ -> skip;
NEWLINE: '\r' ? '\n';

program: 'hello' ID ;
ID: [a-z]+;