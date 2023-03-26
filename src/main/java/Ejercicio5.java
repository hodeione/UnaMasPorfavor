import java.util.Scanner;
import java.util.function.BiFunction;

public class Ejercicio5 {
    public static int mcdRecursivo(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcdRecursivo(b, a % b);
    }
    public static int mcdIterativo(int a, int b) {
        while (b != 0) {
            int aux = b;
            b = a % b;
            a = aux;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int m = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n = sc.nextInt();

        int mcdRecursivo = mcdRecursivo(m, n);
        int mcdIterativo = mcdIterativo(m, n);

        System.out.println("El MCD de " + m + " y " + n + " es:");
        System.out.println("- Recursivo: " + mcdRecursivo);
        System.out.println("- Iterativo: " + mcdIterativo);
    }
}
