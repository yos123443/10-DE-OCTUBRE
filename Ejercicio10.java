
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de piezas producidas: ");
        int piezas = sc.nextInt();

        if (piezas < 0) {
            System.out.println("Cantidad no valida.");
        } else {
            double importe = piezas * 5;
            double incentivo;

            if (piezas > 1000) {
                incentivo = importe * 0.15;
            } else {
                incentivo = importe * 0.08;
            }

            double total = importe + incentivo;

            System.out.println("Importe: S/ " + importe);
            System.out.println("Incentivo: S/ " + incentivo);
            System.out.println("Total: S/ " + total);
        }

        sc.close();
    }
}