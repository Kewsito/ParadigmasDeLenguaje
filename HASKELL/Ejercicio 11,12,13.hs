-- ?Ejercicio 11
-- *Construir un programa no recursivo que realice la suma de números complejos, los cuales se ingresan en sublistas con pares de números donde el primer elemento es la componente real y el segundo la componente imaginaria

sumComplex :: [(Float, Float)] -> (Float, Float)
sumComplex = foldl (\(sumR, sumI) (r, i) -> (r + sumR, i + sumI)) (0, 0)

-- ?Ejercicio 12
-- * Dada una lista ordenada y un átomo escribir una función que inserte el átomo en el lugar correspondiente

insertAtom :: Ord a => [a] -> a -> [a]
insertAtom [] x = [x]
insertAtom (x:xs) y
  | x < y = x : insertAtom xs y
  | otherwise = y : x : xs

-- ?Ejercicio 13
-- * Calcular la suma de dos matrices.
sumaMatrices :: Num a => [[a]] -> [[a]] -> [[a]]
sumaMatrices = zipWith (zipWith (+))

-- ?Ejercicio 14
-- * Hacer el seguimiento de la siguiente función y decir que entrega para el ejemplo propuesto:  Ej: [[1, 2, 3], [2, 3, 4, 5], [6,7, 8]] 

pp::(Integral a) => [[a]] -> [a]
pp xs = foldr (\ x -> (++) [head x]) [] xs

-- ?Ejercicio parcial
-- * Hacer el seguimiento de la siguiente función y decir que entrega para el ejemplo propuesto:  Ej: [1, 2, 3]
sigue [] = []
sigue (x:xs) = otra x xs ++ sigue xs
otra x xp = map (\ p -> [x, p]) xp

-- ?Ejercicio parcial
-- *Definir la función enlace que reciba como argumento dos lista de pares de elementos y construya una nueva lista de pares de la siguiente manera: enlace [[1,2],[5, 6],[20, 8] ...] [[6, 100],[1,200],[3,300],[2,400],[8,500]...]

enlaceParcial::(Integral a) => [[a]] -> [[a]] -> [[a]]
enlaceParcial lista1 lista2 = [head x : [last y | y<-lista2, last x == head y] | x<- lista1]

-- ?Ejercicio parcial
-- *Dada una lista con numero y una lista de numeros ordenada, realizar un programa en haskell que inserte los elementos de la primera lista en la segunda, de modo que la lista resultante quede ordenada EJ: insertarOrdenado [3,9,5] [4,5,8] -> [3,4,5,8,9]

insertarOrdenado :: (Ord a) => [a] -> [a] -> [a]
insertarOrdenado [] ys = ys
insertarOrdenado (x:_) [] = [x]
insertarOrdenado (x:xs) (y:ys)
  | x < y = x : insertarOrdenado xs (y:ys)
  | x > y = y : insertarOrdenado (x:xs) ys
  | otherwise =  insertarOrdenado xs ys


main :: IO ()
main = do
  print (insertarOrdenado [3,9,5] [4,5,8])