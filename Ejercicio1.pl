% Ejercicio 1

% Hechos
humano(turing).
humano(socrates).
griego(socrates).

% Regla
mortal(X) :- humano(X).

% Objetivo (consulta)
?- mortal(X), griego(X).

% Resultado
# El programa comienza por la regla mortal(X) y busca a todos los humanos que son mortales.
# Luego, encuentra a humano(turing) y X = turing.
# Ahora, intenta satisfacer la segunda parte de la consulta, griego(turing), pero no encuentra a turing en la base de conocimientos.
# Por lo tanto, no hay solución para la consulta.
# Luego sigue con el siguiente humano, humano(socrates), y X = socrates.
# Ahora, intenta satisfacer la segunda parte de la consulta, griego(socrates), y encuentra a socrates en la base de conocimientos.
# Por lo tanto, la solución para la consulta es X = socrates.