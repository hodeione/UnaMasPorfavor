import java.util.Scanner;

public class Ejercicio1 {
    //a) La llamada a la función recursiva bisect(0,N) calcula la solucion de la ecuacion x^2-2=0 en el intervalo [0,N]
    // con una precisión de 1.e-6 y devuelve el valor de la solucion que sera ladivision de los dos intervalos
    //b si cambiamos la función f(x) estariamos calculando la solucion de ottra ecuacion distinta
    public static double bisect(double min, double max){
        final double N=2;
        final double PREC=1.e-6;
        double mitad=(min+max)/2;
        while (max-min<PREC){
            if (f(min)*f(max)>0){
                max=mitad;
            }else {
                min=max;
            }
            mitad=(min+max)/2;
        }
        return mitad;
    }
    public static double f(double x){
        return x*x-2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce minimo");
        double min=sc.nextDouble();
        System.out.println("Introduce maximo");
        double max=sc.nextDouble();
        System.out.println(bisect(min,max));
    }
}
