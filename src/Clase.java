import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clase {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);


        System.out.println("Escribe el primer numero ");
        String strNumero1 = buffer.readLine();
        Integer numero1 = Integer.parseInt(strNumero1);

        System.out.println("Escribe el segundo numero ");
        String strNumero2 = buffer.readLine();
        Integer numero2 = Integer.parseInt(strNumero2);

        System.out.println("Escribe el tercer numero ");
        String strNumero3 = buffer.readLine();
        Integer numero3 = Integer.parseInt(strNumero3);

        Integer numeroMayor = numero1;

        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        }
        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }
        System.out.println("El numero mayor es: " + numeroMayor);


        Integer numeroMenor = numero1;

        if (numero2 < numeroMenor) {
            numeroMenor = numero2;
        }
        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
        }
        System.out.println("El numero menor es: " + numeroMenor);

    }

}

