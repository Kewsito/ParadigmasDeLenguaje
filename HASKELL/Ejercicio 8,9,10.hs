import Data.Text.Lazy.Builder.Int (decimal)
-- Ejercicio Nº 8: Definir  una función recursiva que permita eliminar los elementos repetidos de una lista de átomos. 

eliminarRepetidos::(Integral a)=> [a]->[a]
eliminarRepetidos [] = [] 
eliminarRepetidos (x:xs) = x:eliminarRepetidos (filter (/=x) xs)

-- Ejercicio 9 Implementar una función recursiva que pase un número decimal a binario

decimalABinario::(Integral a)=> a->a
decimalABinario 0 = 0
decimalABinario n = (n `mod` 2) + 10 * decimalABinario (n `div` 2)

-- Ejercicio 10  Implementar una función recursiva que permita obtener la unión de dos listas dadas; los elementos repetidos solo deben aparecer una vez.

unionListas::(Integral a)=> [a]->[a]->[a]
-- caso base de si las dos listas son vacias 
unionListas [] [] = []
-- caso base de si la primera lista es vacia, se retorna la segunda lista
unionListas [] ys = ys
-- caso base de si la segunda lista es vacia, se retorna la primera lista
unionListas xs [] = xs
-- caso recursivo de union de listas 
unionListas (x:xs) ys = x:unionListas xs (filter (/=x) ys)
