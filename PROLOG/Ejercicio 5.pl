potencia(_,0,1).
potencia(A,B,C):-B>0,D is B-1,potencia(A,D,C1),C is A*C1.

