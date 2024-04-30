adyac(A,B,[A|[B|_]]).
adyac(A,B,[B|[A|_]]).
adyac(A,B,[_|C]):- adyac(A,B,C).