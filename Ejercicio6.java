
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto de ventas: S/ ");
        double ventas = sc.nextDouble();

        double bonificacion;

        if (ventas > 5000) {
            bonificacion = ventas * 0.10;
        } else {
            bonificacion = ventas * 0.05;
        }

        double total = ventas + bonificacion;

        System.out.println("Bonificacion: S/ " + bonificacion);
        System.out.println("Total con bonificacion: S/ " + total);

        sc.close();
    }
}