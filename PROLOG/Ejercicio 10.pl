%Agregar predicado de union
reves([],[]).
reves([X|Y],R):- reves(Y,Z), append(Z,[X],R).