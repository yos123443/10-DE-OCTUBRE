import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        double horas = sc.nextDouble();

        double salario;

        if (horas > 40) {
            salario = (40 * 20) + ((horas - 40) * 40);
        } else {
            salario = horas * 20;
        }

        System.out.println("Salario total: S/ " + salario);
        sc.close();
    }
}