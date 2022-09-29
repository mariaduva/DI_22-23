package EjerciciosRepaso;

import java.util.Scanner;

public class ej2_2 {
    /**
     * Programa Java que solicita por pantalla el valor del radio de una circunferencia y calcula/muestra por
     * pantalla la longitud y el área de la circunferencia.
     * @author María J. Duque
     */
    public static Scanner sc;
    public static final double PI = 3.1416;

    public static void main(String[] args){
        sc = new Scanner(System.in);

        System.out.println("Introduce el radio de la circunferencia:");

        double radio = Double.parseDouble(sc.nextLine());
        double longitud = 2 * PI * radio;
        double area = PI * radio * radio;

        System.out.println("La longitud de la circunferencia es de " + longitud + " y su área es de " + area);

        sc.close();
    }
}
