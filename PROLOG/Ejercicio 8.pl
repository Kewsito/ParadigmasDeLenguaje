miembro(A,[A|_]).
miembro(A,[_|Y]):- miembro(A,Y).