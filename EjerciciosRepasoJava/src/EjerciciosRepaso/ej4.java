package EjerciciosRepaso;

import java.util.Scanner;

public class ej4 {
    /**
     * Programa Java que solicita por pantalla una cantidad de números enteros (tanto positivos como negativos),
     * los almacena en una array y a continuación hace la media de todos los números, los positivos y los negativos.
     */
    static Scanner sc;
    static final int TOTAL_NUMBERS = 10;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        int numbers[] = new int[TOTAL_NUMBERS];

        System.out.println("Introduce " + TOTAL_NUMBERS + " números");
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = askNumber(i + 1);
        }
        doAvg(numbers);

        sc.close();
    }

    private static void doAvg(int[] numbers) {
        int positiveNumbs = 0;
        int sumPos = 0;
        int sumNeg = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] >= 0) {
                sumPos += numbers [i];
                positiveNumbs++;
            } else {
                sumNeg += numbers [i];
            }
        }

        System.out.println("Media de todos los números:" + printAvg(TOTAL_NUMBERS, (sumNeg + sumPos)));
        System.out.println("Media de los números positivos:" + printAvg(positiveNumbs, sumPos));
        System.out.println("Media de los números negativos:" + printAvg((TOTAL_NUMBERS - positiveNumbs), sumNeg));

    }

    private static String printAvg(int amountNum, int sumNum) {
        String msj = "";
        double avg = (double) sumNum/amountNum;
        if (Double.isFinite(avg)) {
            msj = "(" + sumNum +" / " + amountNum + ") = " + avg;
        } else {
            msj = "(" + sumNum +" / " + amountNum + ") = No determinado";
        }
        return msj;
    }

    private static int askNumber(int index) {
        boolean isValid = true;
        int number = 0;
        while (isValid) {
            try {
                System.out.println(index + "º: " );
                number = Integer.parseInt(sc.nextLine());
                isValid = false;
            } catch (NumberFormatException e) {
                System.out.println("El número debe ser entero");
            }
        }
        return number;
    }
}
