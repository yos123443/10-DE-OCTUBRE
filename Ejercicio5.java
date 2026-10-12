
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int c = sc.nextInt();

        int mayor;
        int menor;

        if (a >= b && a >= c) {
            mayor = a;
        } else if (b >= a && b >= c) {
            mayor = b;
        } else {
            mayor = c;
        }

        if (a <= b && a <= c) {
            menor = a;
        } else if (b <= a && b <= c) {
            menor = b;
        } else {
            menor = c;
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Diferencia: " + (mayor - menor));

        sc.close();
    }
}