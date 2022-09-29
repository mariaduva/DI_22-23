package EjerciciosRepaso;

/**
 * Programa Java que declara cuatro variables enteras a, b, c y d a las que se les declara un valor
 * inicial a cada una y luego son intercambiados: b toma el valor de c, c toma el valor de a, a
 * toma el valor de d, d toma el valor de b
 * @author María J. Duque
 */
public class ej1_1 {

    public static void main(String[] args) {

        int a = 42;
        int b = 17;
        int c = -4;
        int d = 10;

        System.out.println("A:" + a + " B:" + b + " C:" + c + " D:" + d );

        int aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;

        System.out.println("A:" + a + " B:" + b + " C:" + c + " D:" + d );
    }
}
