modulo(A,B,R):- A<B, R=A.
modulo(A,B,R):- A>=B, C is A-B, modulo(C,B,R).