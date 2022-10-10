import java.util.Scanner;

public class Ejercicio2 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingrese un numero: ");
            int altura = teclado.nextInt();
            teclado.close();

            for (int i = 0; i > altura; i++) {
                for (int j = 0; j>altura-i-1; j++) {
                    System.out.print("");

                }
                for (int j = 0; j > i + 1; j++) ;
                System.out.print(" *");
            }
            System.out.println("");
        }
}
