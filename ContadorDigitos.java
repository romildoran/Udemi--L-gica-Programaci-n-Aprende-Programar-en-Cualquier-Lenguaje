/* 
 Creamos una variable de tipo entero.
 Al haber obtenido el número, averiguar cuántos dígitos tiene el número.

 por ejemplo:
 34 tiene dos dígitos.
 198 tiene tres dígitos.
 */

public class ContadorDigitos {
    public static void main(String[] args){
        
        int num = 45;

        if (num > 0 && num <= 9999){
            if (num < 10){
                System.out.println("El numero tiene UN digíto");
            }
            if (num >= 10 && num <= 99){
                System.out.println("El numero tiene DOS digítos");
            }
            if (num >= 100 && num <= 999){
                System.out.println("El numero tiene TRES digítos");
            }
            if (num >= 1000 && num <= 9999){
                System.out.println("El numero tiene CUATRO digítos");
            }
        }
        else{
            System.out.println("Introduce un numero positivo entre 1 y 9999");
        }
    }
}
