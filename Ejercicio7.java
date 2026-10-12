
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();

        if (peso <= 50) {
            System.out.println("Paquete aceptado.");
        } else {
            System.out.println("Paquete rechazado.");
            System.out.println("Exceso de peso: " + (peso - 50) + " kg");
        }

        sc.close();
    }
}