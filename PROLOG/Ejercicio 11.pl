elim(X,[X|L1],L1).
elim(X,[_|L1],[_|L2]):- elim(X,L1,L2).

%Eliminar mas de un elemento%
elim(_,[],[]):-!.
elim(X,[X|A],R):-elim(X,A,R),!.
elim(X,[Y|C],[Y|Cs]):-Y \= X,elim(X,C,Cs).