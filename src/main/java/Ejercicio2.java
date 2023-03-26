import java.util.Scanner;
import java.util.function.IntConsumer;

public class Ejercicio2 {
    //En el pseudocodigo de la funcion recursiva se puede ver que se divide el intervalo en dos partes
    //y se llama a la funcion recursiva con cada una de las partes
    //como el condiconal principal es que num>1 ese serra el limite de la recursividad.
    //A) La función f(x,2) divide de manera repetida x por 2 hasta que ya no es posible dividirlo por 2,
    // imprimiendo en cada iteración el divisor utilizado. En otras palabras, imprime los factores primos de x.
    //b) El nombre más adecuado deberia de ser descomposicionPrimos

    public static void factorizacionIterativa(int num){
        for (int i = 2; i <= num; i++) {
            while (num%i==0){
                System.out.println(i);
                num/=i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce numero a factorizar");
        int num=sc.nextInt();
        System.out.println("Factorizacion iterativa");
        factorizacionIterativa(num);

        System.out.println("Factorización mediante expresiones lambda");

        //Factorizacion mediante expresiones lambda
        IntConsumer factorizar = n -> {
            int div = 2;
            while (n > 1) {
                if (n % div == 0) {
                    System.out.println(div);
                    n = n / div;
                } else {
                    div++;
                }
            }
        };
        factorizar.accept(num);
    }

    private static void accept(int num) {
        int div = 2;
        while (num > 1) {
            if (num % div == 0) {
                System.out.println(div);
                num = num / div;
            } else {
                div++;
            }


        }
    }
}
