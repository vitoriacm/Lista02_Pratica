import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
             Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número positivo:");
        int numero = teclado.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido. Por favor, digite um número positivo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                System.out.println("Tabuada do número " + i + ":");
                for (int j = 1; j <= 10; j++) {
                    int resultado = i * j;
                    System.out.println(i + " x " + j + " = " + resultado);
                }
                System.out.println();
            }
        }

        teclado.close();
    }
}
