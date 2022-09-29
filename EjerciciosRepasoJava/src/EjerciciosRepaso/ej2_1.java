package EjerciciosRepaso;

import java.util.Scanner;

public class ej2_1 {
    /**
     * Programa Java que solicita al usuario la temperatura media del dia en cantidad de grados
     * centígrados y la convierte grados Fahrenheit. °F = (°C x 1,8) + 32
     * @author María J. Duque
     */
    public static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);

        System.out.println("Introduce la temperatura media de hoy:");
        double tempCelsius  = Double.parseDouble(sc.nextLine());
        double tempFahrenheit = ( tempCelsius * 1.8) + 32;

        System.out.println("La temperatura media de hoy es de " + tempFahrenheit + " °F / " + tempCelsius + " °C");

        sc.close();
    }
}
