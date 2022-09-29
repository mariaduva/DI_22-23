package EjerciciosRepaso;

import java.util.Scanner;

public class ej3 {
    /**
     * Programa Java que solicita por pantalla un mes como valor entero, comprueba si es un valor
     * comprendido entre 1-12 y muestra por pantalla el nombre del mes y el número de días que tiene.
     * En el caso de que el mes introducido sea febrero, se solicita el año para calcular el número de días
     * según si es bisiesto o no.
     * @author María J. Duque
     */

    public static final String MONTHS[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Scanner sc;

    public static void main(String[] args){
        sc = new Scanner(System.in);

        int month = askMonth();
        int year = 0;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                year = askYear();
                if (isLeapYear(year)){
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Mes invalido");
                break;

        }
        if(numDays == 28 || numDays == 29){
            if(isLeapYear(year)) System.out.println(year + " es un año bisiesto. Por lo tanto, " + MONTHS[month - 1]
                    + " tiene " + numDays + " días.");
            else System.out.println(year + " no es un año bisiesto. Por lo tanto, " + MONTHS[month - 1]
                    + " tiene " + numDays + " días.");
        } else {
            System.out.println("El mes de " + MONTHS[month - 1] + " tiene " + numDays + " días.");
        }

        sc.close();
    }

    private static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (((year % 4 == 0) &&
                !(year % 100 == 0))
                || (year % 400 == 0)) {
            leapYear = true;
        }
        return leapYear;
    }

    private static int askYear() {
        int year = 0;
        boolean isValid = true;
        while (isValid) {
            try {
                System.out.println("Introduce el año");
                year = Integer.parseInt(sc.nextLine());
                isValid = false;
            } catch (NumberFormatException e) {
                System.out.println("El año debe ser un número");
            }
        }
        return year;
    }

    private static int askMonth() {
        int month = 0;
        boolean isValid = true;
        while (isValid) {
            try {
                System.out.println("Introduce un mes (1-12):");
                month = Integer.parseInt(sc.nextLine());
                if (month < 1 || month > 12) {
                    throw new Exception();
                }
                isValid = false;
            } catch (Exception e) {
                System.out.println("El mes introducido no es válido");
                sc.nextLine();
            }
        }
        return month;
    }
}
