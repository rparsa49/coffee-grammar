grammar English;

NEWLINE: '\r' ? '\n';
WS: [\t]+ -> skip;

sentence: nounphrase verbphrase;
nounphrase: article noun;
article: 'a' | 'the';
noun: 'girl' | 'cat';
verbphrase: verb nounphrase;
verb: 'has' | 'pets';