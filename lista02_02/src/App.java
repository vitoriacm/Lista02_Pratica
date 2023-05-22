import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner (System.in);

        System.out.println("Digite o 1 valor ");
        int valorA = teclado.nextInt();

        System.out.println ("Digite o 2 valor");
        int valorB = teclado.nextInt();

        System.out.println("Digite o 3 valor");
        int valorC = teclado.nextInt();

        teclado.close();

        if (valorA <= valorB && valorA <= valorC) {
            if (valorB <= valorC) {
                System.out.printf("Ordem crescente: %d %d %d", valorA, valorB, valorC);
            } else {
                System.out.printf("Ordem crescente: %d %d %d", valorA, valorC, valorB);
            }
        } else if (valorB <= valorA && valorB <= valorC) {
            if (valorA <= valorC) {
                System.out.printf("Ordem crescente: %d %d %d", valorB, valorA, valorC);
            } else {
                System.out.printf("Ordem crescente: %d %d %d", valorB, valorC, valorA);
            }
        } else {
            if (valorA <= valorB) {
                System.out.printf("Ordem crescente: %d %d %d", valorC, valorA, valorB);
            } else {
                System.out.printf("Ordem crescente: %d %d %d", valorC, valorB, valorA);
            }
        }
   }
}
