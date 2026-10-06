import java.util.Scanner;

public class Ej3 {
    public static void main (String[] args){
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce el operador 1");
        int op1 = lector.nextInt();
        System.out.println("Introduce el operador 2");
        int op2 = lector.nextInt();
        lector.close();

        int suma = op1+op2;
        int resta = op1-op2;
        int multi = op1*op2;
        int diviEntera = op1/op2;
        int restoEntero = op1%op2;
        double divReal = (double) op1/op2;
        double restoReal = op1%op2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+multi);
        System.out.println("Division entera: "+diviEntera);
        System.out.println("Resto entero: "+restoEntero);
        System.out.println("Division real: "+divReal);
        System.out.println("Resto real: "+restoReal);
    }
}
