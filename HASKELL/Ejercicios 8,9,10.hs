-- Ejercicio Nº 8: Definir  una función recursiva que permita eliminar los elementos repetidos de una lista de átomos. 

eliminarRepetidos::(Integral a)=> [a]->[a]
eliminarRepetidos [] = [] 
eliminarRepetidos (x:xs) = x:eliminarRepetidos (filter (/=x) xs)