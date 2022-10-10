import java.util.Scanner;
    public class Ejercicio {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese numero: ");
            int altura = sc.nextInt();
            sc.close();

            System.out.println();
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j<=altura-i; j++) {
                    System.out.print("");

                }
                for (int j = 1; j <= (i*2)-1; j++) ;
                System.out.print(" *");
                }
                System.out.println("");
            }
    }
