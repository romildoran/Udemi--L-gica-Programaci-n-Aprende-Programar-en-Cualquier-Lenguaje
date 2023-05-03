/* 
Algoritmo:

INICIO
intrucir un numero
si el numero es payor que cero, verificar si el numero es PAR
si no lo es, mostrar que el numero es IMPAR
sino, pedir que introduzca algun numero positivo
FIN 
*/

/* 
Pseudocodigo:

INICIO
Numero: Entero (int)
Escribe: "Introduce un numero"(string)
Lee: Numero
Si(if): Numero != 0
si(if): Numero %2 = 0
Entonces: mostrar "El numero es PAR"
Sino (else): mostrar "El numero es impar"
Sino (else): mostrar "Introduce algun numero positivo"
FIN
*/

public class NumeroPar {
    public static void main(String[] args){

        int numero = 4;

        if (numero > 0){
            if (numero % 2 == 0){
                        System.out.println("El numero introducido es PAR");
                    }else{
                        System.out.println("El numero introducido es IMPAR");
                    }
        }else{
            System.out.println("Introduce algun numero positivo");
        }
    }
}
