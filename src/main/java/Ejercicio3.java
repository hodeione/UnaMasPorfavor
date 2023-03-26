import java.util.Scanner;

public class Ejercicio3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un número decimal: ");
            int decimal = sc.nextInt();
            int opcion;
            do {
                System.out.println("\nMenú de opciones:");
                System.out.println("1. Convertir a hexadecimal");
                System.out.println("2. Convertir a otra base");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        String hexadecimal = decimalAHexadecimal(decimal);
                        System.out.println("El número " + decimal + " en hexadecimal es: " + hexadecimal);
                        break;
                    case 2:
                        System.out.print("Ingrese la base a la que desea convertir el número: ");
                        int base = sc.nextInt();
                        String baseB = decimalABase(decimal, base);
                        System.out.println("El número " + decimal + " en base " + base + " es: " + baseB);
                        break;
                    case 3:
                        System.out.println("¡Adiós!");
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            } while (opcion != 3);
        }

        public static String decimalAHexadecimal(int decimal) {
            String hexadecimal = "";
            while (decimal > 0) {
                int residuo = decimal % 16;
                if (residuo < 10) {
                    hexadecimal = residuo + hexadecimal;
                } else {
                    hexadecimal = (char) ('A' + residuo - 10) + hexadecimal;
                }
                decimal /= 16;
            }
            return hexadecimal;
        }

        public static String decimalABase(int decimal, int base) {
            String baseB = "";
            while (decimal > 0) {
                int residuo = decimal % base;
                if (residuo < 10) {
                    baseB = residuo + baseB;
                } else {
                    baseB = (char) ('A' + residuo - 10) + baseB;
                }
                decimal /= base;
            }
            return baseB;
        }
}
