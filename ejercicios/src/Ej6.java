import java.util.Scanner;

public class Ej6 {
    public static void main (String[] args){
    Scanner lector = new Scanner (System.in);
        System.out.println("Valor de la compra (entre 0.00 y 500.00):");
        double valor = lector.nextDouble();
        System.out.println("IVA que se te aplica (entre 0 y 25%):");
        double iva = 1+lector.nextInt()/100.0;
        lector.close();

        double compra = valor/iva;
    }
}
