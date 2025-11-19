package entrega_02;

import src.MyScanner;

public class CalculadoraBasica {
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) throws dividir0Exception {
        System.out.println("=== CALCULADORA BÁSICA ===");

        int a = sc.pedirNumero("Introduce el numero 1:");

        if (a<0 || a>100) {
            System.out.println("El numero introducido no es valido");
            a = sc.pedirNumero("Introduce el numero 1:");
        }

        int b = sc.pedirNumero("Introduce el numero 2:");

        if (b<0 || b>100) {
            System.out.println("El numero introducido no es valido");
            b = sc.pedirNumero("Introduce el numero 2:");
        }

        System.out.println("==== RESUMEN ====");
        System.out.println("Número 1:" +a);
        System.out.println("Número 2:" +b);
        System.out.println("Suma: " +sumar(a, b));
        System.out.println("Resta: " +restar(a, b));
        System.out.println("Multiplicacion: " +multiplicar(a, b));
        try{
            System.out.println("División: "+dividir(a, b));
        } catch (dividir0Exception e) {
            System.out.println("División: "+e.getMessage());
        }
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) throws dividir0Exception {

        if (b == 0) {
            throw new dividir0Exception("No se puede dividir por 0");
        }

        return a / b;
    }
}
