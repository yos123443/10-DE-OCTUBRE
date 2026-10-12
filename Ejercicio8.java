
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el promedio (0 a 20): ");
        double promedio = sc.nextDouble();

        if (promedio < 0 || promedio > 20) {
            System.out.println("Promedio no valido.");
        } else if (promedio < 11) {
            System.out.println("Desaprobado");
        } else if (promedio <= 14) {
            System.out.println("Regular");
        } else if (promedio <= 17) {
            System.out.println("Bueno");
        } else {
            System.out.println("Excelente");
        }

        sc.close();
    }
}