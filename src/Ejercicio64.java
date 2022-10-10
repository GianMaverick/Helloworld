import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio64 {
    private static int i;

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{6, 7, 8, 9, 10};
        int[] c = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) ;
        System.out.println("Introduce un numero: " + i + " del array a:");
        a[i] = sc.nextInt();

        for (int i = 0; i < b.length; i++) ;
        System.out.println("Introduce un numero: ");
        b[i] = sc.nextInt();


        int posicionC = 0;
        for (int i = 0; i < a.length; i++) {
            c[posicionC] = a[i];
            posicionC++;
            c[posicionC] = b[i];
            posicionC++;
        }
            System.out.println(Arrays.toString(c));

    }
}