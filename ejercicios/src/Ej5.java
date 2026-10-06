import java.util.Scanner;

public class Ej5 {
    public static void main (String[] args){
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduzca un numero de segundos: ");
        int op1 = lector.nextInt();
        lector.close();

        int horas = op1/3600;
        int resto =op1%3600;
        int minutos = resto/60;
        int segundos = resto%60;
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos);


    }
}
