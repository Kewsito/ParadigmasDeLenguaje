medico(m1,rosales).  
medico(m2,manni).  
paciente(p1,juan).  
paciente(p2,ana).  
atiende(m1,p1).  
atiende(m1,p2).  
atiende(m2,p2).  

buscar(N,P):- medico(X,N), atiende(X,Y), paciente(Y,P).

base:- write("# 1. Buscar medico por paciente"), nl, write("# 2. Buscar paciente por medico"), nl, write("# 3. Salir"), nl, read(X), opcion(X).

opcion(1):- write("# Ingrese el nombre del medico"), read(N), buscar(N,P),writeIn(P), fail.
opcion(2):- write("# Ingrese el nombre del paciente"), read(P), buscar(N,P),writeIn(N), fail.
opcion(3):- write("# Terminar").
opcion(_):- base.


