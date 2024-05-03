--Funcion modulo restas sucesivas

modul:: (Integral a) => a -> a ->a 
modul a b
    | a == 0 = 0
    | a < b = a 
    | otherwise = modul (a-b) b

-- series de fibonacci 
seriefibonacci:: Int -> Int
seriefibonacci 0 = 0
seriefibonacci 1 = 1
seriefibonacci n = seriefibonacci(n-1) + seriefibonacci(n-2)
