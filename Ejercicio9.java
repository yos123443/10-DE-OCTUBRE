
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la distancia en km: ");
        double km = sc.nextDouble();

        double tarifa;

        if (km < 0) {
            System.out.println("Distancia no valida.");
        } else if (km <= 3) {
            tarifa = 8;
            System.out.println("Tarifa del taxi: S/ " + tarifa);
        } else {
            tarifa = 8 + (km - 3) * 2.50;
            System.out.println("Tarifa del taxi: S/ " + tarifa);
        }

        sc.close();
    }
}