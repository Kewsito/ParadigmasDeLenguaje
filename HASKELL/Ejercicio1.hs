main :: IO ()
main = do
    --1
    -- Resultado: 4 \\ agarra el minimo entre los maximos 4 y 7
    let a = min (max 3 4) (max 7 3)
    --2 
    -- Resultado: 16 \\ agarra el sucesor de 9 y le suma el maximo entre 5 y 4 y le suma 1
    let b = (succ 9) + (max 5 4) +1

    --3
    -- Resultado: 9 \\ agarra max 8 y le sucede el 9 , agarra el minimo entre 6 y 8 y le sucede el 7, de entre 9 y 7 agarra el maximo.
    let c = (max (succ (max 6 8)) (succ (min 6 8)))

    --4
    -- Resultado: 3 \\ Divide 15 en 4 y agarra el cociente como entero
    let d = (div 15 4)

    --FUNCIONES SOBRE LISTAS. ANALIZADORES DE LISTAS: head- tail- last- elem
    --5
    -- Resultado: 3 \\ agarra el primer elemento de la lista
    let e = head [3,6,9]

    --6
    -- Resultado: a \\ agarra la cabeza de la lista
    let f = head ['a','b','c']

    --7
    -- Resultado: a \\ agarra la cabeza de la lista de caracteres
    let g = head "abcd"

    --8
    -- Resultado: 'd' \\ tail --> agarra la cola de la lista y trae ["cd"], head --> agarra la cabeza de la lista ["cd"] y trae "cd", tail --> agarra la cola de la lista y trae "d"
    let h = tail (head (tail ["ab","cd"]))

    --9
    -- Resultado: ["uno","tres"] \\ asigna a la variable impares la lista ["uno","tres"]
    let impares = ["uno","tres"]

    --10
    -- "cinco": impares

    --11
    -- [“siete”]++ impares

    --12
    -- Resultado: PRINT IMPARES

    --13
    -- (last impares)
    \
    --14 Define una lista con los elementos 3,1,8,5,4,2
    -- uno = [3,1,8,5,4,2]

    --15 \\ Define una lista con los elementos 7,9,3,5,1
    -- dos = [7,9,3,5,1] 

    --16 \\ Resultado: [3,7]
    -- nueva = [(head uno), (head dos)]

    --17 \\ Divide la lista uno cada 3 elementos
    -- (splitAt 3 uno) 

    --18 \\ (uno !! 2) \\ agarra el elemento en la posicion 2 de la lista uno

    --19 \\ (dos !! 0) \\ agarra el elemento en la posicion 0 de la lista dos

    --20 \\ lista = [(uno !! 2), (dos !! 3)] \\ agarra el elemento en la posicion 2 de la lista uno y el elemento en la posicion 3 de la lista dos

    --21 \\ sum uno \\ suma los elementos de la lista uno

    --22 \\ product dos \\ multiplica los elementos de la lista dos

    --23 \\ null impares \\ devuelve False si la lista impares no esta vacia

    --24 \\ reverse impares \\ invierte la lista impares

    --25 \\ take 2 uno \\ agarra los primeros 2 elementos de la lista uno

    --26 \\ drop 2 dos \\ elimina los primeros 2 elementos de la lista dos

    --27 \\ maximum dos \\ agarra el maximo de la lista dos

    --28 \\ minimum impares \\ agarra por posicion alfabetica cuando se trata de strings de la lista impares

    --29 \\ elem "cinco" impares \\ devuelve True si el elemento cinco esta en la lista impares

    --30 \\ elem "seis" impares \\ devuelve False si el elemento "seis" esta en la lista impares

    --31 \\ (not  (elem “tres” impares))

    --32 \\ (notElem “tres” impares) 

    --33 \\ ((elem “uno” impares) && (elem “siete” impares))

    --34 \\ ((elem “uno” impares) || (elem “siete” impares))

    --35 \\ (length [“Jose”, “Antonio”,”Mario”])

    --36 \\ length [ [“Jose”, “Antonio”,” Mario”]])