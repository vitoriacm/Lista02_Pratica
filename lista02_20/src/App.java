import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a carga máxima do elevador em kg:");
        int cargaMaxima = teclado.nextInt();

        System.out.println("Digite a quantidade máxima de pessoas no elevador:");
        int maximoPessoas = teclado.nextInt();

        int cargaAtual = 0;
        int pessoas = 0;

        do {
            System.out.println("Digite o peso da pessoa em kg:");
            int peso = teclado.nextInt();

            cargaAtual += peso;
            pessoas++;

            if (cargaAtual >= cargaMaxima || pessoas >= maximoPessoas) {
                break;
            }

        } while (true);

        System.out.println("A carga máxima foi atingida ou o número máximo de pessoas foi atingido.");

        teclado.close();
    }
}
