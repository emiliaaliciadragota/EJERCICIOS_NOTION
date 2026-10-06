import java.util.Scanner;

public class Ej4 {
    public static void main (String[] args){
        final double COSTEBEBIDA = 1.25;
        final double COSTEBOCATA = 2.05;

        Scanner lector = new Scanner (System.in);
        System.out.println("Numero de bebidas:");
        int nrBebidas = lector.nextInt();
        System.out.println("Número de bocadillos: ");
        int nrBocadillos = lector.nextInt();
        lector.close();

        double multiBebidas = (double)COSTEBEBIDA*nrBebidas;
        double multiBocadillos = (double)COSTEBOCATA*nrBocadillos;
        System.out.println("Coste bebidas: "+multiBebidas+ "€");
        System.out.println("Coste bocadillos: "+multiBocadillos+"€");
        double suma = multiBebidas+multiBocadillos;
        System.out.println("Coste consumicion: "+suma+"€");


    }
}
