import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o volume inicial em centímetros cúbicos:");
        int volumeInicial = teclado.nextInt();

        int volumeAtual = volumeInicial;
        int tempo = 0;

        while (volumeAtual <= 1000) {
            volumeAtual *= 2;
            tempo++;
        }

        System.out.println("O tempo necessário para o volume se tornar maior que 1000 cm³ é de " + tempo + " segundos.");

        teclado.close();
    }
}
