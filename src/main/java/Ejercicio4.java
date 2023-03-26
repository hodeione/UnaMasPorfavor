import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("¿Es palíndromo? " + esPalindromoIterativo(cadena));
        System.out.println("¿Es palíndromo? " + esPalindromoRecursivo(cadena));

    }
    public static boolean esPalindromoIterativo(String cadena) {
        int primerCaracter = 0;
        int ultimoCaracter = cadena.length() - 1;
        while (primerCaracter < ultimoCaracter) {
            if (cadena.charAt(primerCaracter) != cadena.charAt(ultimoCaracter)) {
                return false;
            }
            primerCaracter++;
            ultimoCaracter--;
        }
        return true;
    }

    public static boolean esPalindromoRecursivo(String cadena) {
        if (cadena.length() <= 1) {
            return true;
        }
        if (cadena.charAt(0) != cadena.charAt(cadena.length() - 1)) {
            return false;
        }
        return esPalindromoRecursivo(cadena.substring(1, cadena.length() - 1));
    }
}
