grammar Coffee;

WS: [\t]+ -> skip;
NEWLINE: ('\r' | 'n') -> skip;

program: action* 'quit';
action: power | brew;

//power action
power: 'power' State opt_time?;
opt_time: 'at' time;
time: Digit ':' Digit ('am' | 'pm');
State: 'on' | 'off';
Digit: [0-9]+;

//brew action
brew: 'brew' Digit container 'of' flavor? drink 'to' place;
container: 'cup'| 'mug' | 'shot'| 'cups' | 'mugs' | 'shots'|;
flavor: 'regular' | 'strong' | 'mild';
drink: 'coffee' | 'espresso';
place: 'stay' | 'go';