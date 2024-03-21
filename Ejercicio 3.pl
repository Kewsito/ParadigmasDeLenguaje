%Ejercicio 3

% Hechos

%X es padre de Y
padre(X,Y).
% X es madre de Y
madre(X,Y).
% X es hombre
hombre(X).
% X es mujer
mujer(X).
% X es padre o madre de Y
progenitor(X,Y).


es_madre(X):- mujer(X),progenitor (X,_).
es_padre(X):- hombre(X),progenitor (X,_).
es_hijo(X):- hombre(X),progenitor (_,X).
es_hija(X,Y):- madre(Y),mujer(X),progenitor (_,X).
tio(X,Y):- hombre(X), progenitor(Z,X), progenitor(Z,C), X\=C, progenitor(C,Y).
sobrino(X,Y):- hombre(X), progenitor(Z,X), progenitor(Z,C), X\=C, progenitor(C,Y).
prima(X,Y):- mujer(X), progenitor(Z,A), progenitor(Z,C), A\=C, progenitor(C,Y), progenitor(A,X).

abuelo_o_abuela(X,Y):- progenitor(X,Z), progenitor(Z,Y).

