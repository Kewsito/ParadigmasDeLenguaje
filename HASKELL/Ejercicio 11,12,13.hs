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
pp [] = []
pp (x:xs) = [head x] ++ pp  xs
