
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el consumo en kWh: ");
        double consumo = sc.nextDouble();

        double monto;

        if (consumo <= 100) {
            monto = consumo * 0.80;
        } else {
            monto = consumo * 1.20;
        }

        System.out.println("Monto a pagar: S/ " + monto);
        sc.close();
    }
}