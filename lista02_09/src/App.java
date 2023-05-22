
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da venda:");
        double valorVenda = teclado.nextDouble();

        System.out.println("Escolha a condição de pagamento:");
        System.out.println("1 - Venda à vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");

        int opcao = teclado.nextInt();

        double desconto = 0;
        double acrescimo = 0;

        if (opcao == 1) {
            desconto = 0.1;
        } else if (opcao == 2) {
            desconto = 0.05;
        } else if (opcao == 4) {
            acrescimo = 0.05;
        } else if (opcao == 5) {
            desconto = 0.08;
        } else if (opcao == 6) {
            desconto = 0.07;
        }

        double totalVenda = valorVenda * (1 - desconto + acrescimo);

        System.out.printf("O total da venda é: R$ %.2f", totalVenda);

        teclado.close();
    }
}
