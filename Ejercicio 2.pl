% Ejercicio 2

% Hechos
progenitor(joaquin,marcos).
progenitor(joaquin,facundo).
progenitor(florencia,matias).
progenitor(martia,andrea).

% Reglas
% hermano(X,Y):- progenitor(Z,X), progenitor(Z,Y).

% a) Un hermano puede ser hermano de si misma por que en la regla no excluye el caso en que X e Y sean la misma persona. Es decir, si X e Y son la misma persona, ambos tendrán el mismo progenitor Z, por lo que la regla se cumple.
hermano(marcos,X)

% b) Para evitar que X sea diferente a Y se puede agregar la condición X\=Y a la regla hermano(X,Y). De esta forma, la regla quedaría de la siguiente manera:
hermano(X,Y):- progenitor(Z,X), progenitor(Z,Y), X\=Y.

% c) Consulta hermano(marcos,X). 
% La consulta devuelve X = facundo.
