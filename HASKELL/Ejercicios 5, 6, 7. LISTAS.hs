import System.Win32 (SECURITY_ATTRIBUTES(nLength))
import Distribution.FieldGrammar (List)
-- EJERCICIO 5 \ Definir una función que cuente los elementos pares tiene una lista de números.
cuentaPares::(Integral a)=> [a]-> Int
--Resolucion 1
cuentaPares [] = 0
cuentaPares lista = length ([x | x <-lista, even (x)])

--Resolucion 2
-- cuentaPares (x:xs) = if (mod x 2 == 0) then 1 + cuentaPares xs else cuentaPares xs

-- EJERCICIO 6 \  Definir una función que reciba una lista de listas y entregue la cantidad de elementos de la lista de mayor longitud

cuentaListas::(Integral a)=>[[a]]->Int
cuentaListas [] = 0
cuentaListas lista = maximum([length (x) | x <-lista])

-- Ejercicio Nº 7: Definir una función que transforme una lista de números en otra lista que contenga el cubo de cada elemento.

transformarLista :: (Integral a) => [a] -> [a]
transformarLista lista = [x*x*x | x <- lista]

main::IO()
main = do
    let a= [1..10]
    print (cuentaPares a)
    print (transformarLista a)

    let b= [[1,2,3,4],[2,4,5,6,4],[2,253,52,35,5,4]]
    print (cuentaListas b)


