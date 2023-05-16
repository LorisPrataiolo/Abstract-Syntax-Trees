
# AST TRAVERSAL DATA ORIENTED
## appunti



Exp ::= INTLIT | ’-’ Exp | Exp ’*’ Exp | ’(’ Exp ’)’
Ovvero un'operazione di moltiplicazione ( o una concatenazione di moltiplicazioni ) tra due interi , questi interi possono essere anche negativi .


file : **AST**  viene definita l'interfaccia la quale a solo due metodi , *toPrefixNotation* il quale restituirà una stringa che rappresenterà l'espressione secondo la notazione postfix . E il secondo metodo : *eval* il quale restituirà il valore della espressione in input .

