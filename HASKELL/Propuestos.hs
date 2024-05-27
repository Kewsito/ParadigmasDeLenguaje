-- !14
-- *Defina una función que, aplicada a una lista de listas, permita obtener una lista de un solo nivel. ej : [[1,2,3],[4,5],[6,7,8,9],[10]]

--funcionLista:: (Integral a) => [[a]] -> [a]
--funcionLista [] = []
--funcionLista (a:ax) = [ x | x<- a] ++ funcionLista ax

-- !15
-- * Sea lista1 = [[100, 1], [200, 2]]   y   lista2 = [[2, 20], [1, 10]]  Evaluar la siguiente construcción: 
-- ?[(head x) : [ last y | y <- lista2, last x == head y] | x <- lista1]

-- !16
-- *  Evaluar la siguiente construcción: 
-- ? map (\x -> map (\y -> (x , y)) [ 'a', 'b']) [1..3]

scanner :: (Integral a ) => a -> [a] -> [a]
scanner n [] = [n]
scanner n (x:xs) = x + head (scanner n xs) : scanner n xs

-- !18
-- *  Ejercicio NO 18: Escriba un programa que recibiendo como argumento una lista de listas donde cada sublista contiene nombre del docente, dedicación y carrera donde trabaja; entregue como resultado una lista con los nombres de los docentes que cobrarán un plus considerando que los cobrarán aquellos docentes que tenga solamente un cargo con dedicación simple.

plus :: [[String]] -> [String]
plus = filter (/= "") . map (\x -> if head (tail x) == "Simple" then head x else "")


-- Ejercicio 2: Construye una función que reciba como argumento una matriz y retorne la traspuesta de la misma

transpuesta :: [[a]] -> [[a]]
transpuesta [] = []
transpuesta ([]:_) = []
transpuesta x = map head x : transpuesta (map tail x)

buscar:: [String] -> [String]
buscar xs = map (\ x -> [p | p <- x, elem p ['a' .. 'z']]) xs

-- buscar ["Estamos","aprendiendo","HasKell."]
--resultado=["stamos","aprendiendo","asell"]

sumaPoli::(Integral a) => [[a]]->[[a]]->[[a]]
sumaPoli [] []= []
sumaPoli (x:ax) (y:ay)
    | last x == last y = (head x + head y : [last x]) : sumaPoli ax ay
    | last x > last y = x: y : sumaPoli ax ay
    | otherwise = y : x : sumaPoli ax ay


-- [[3,4],[2,1],[6,0]] [[6,3],[5,1],[8,0]]