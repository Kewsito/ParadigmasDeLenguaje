potencia(A,B,C):-B=0,C is 1.
potencia(A,B,C):-B>0,D is B-1,potencia(A,D,C1),C is A*C1.

