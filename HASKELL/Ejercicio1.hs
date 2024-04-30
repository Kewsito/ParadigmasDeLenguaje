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
    "cinco": impares

    print impares
