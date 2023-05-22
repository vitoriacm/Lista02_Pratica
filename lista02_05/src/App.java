import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      
       Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = teclado.nextLine();

        System.out.println("Digite o seu sobrenome");
        String sobrenome = teclado.nextLine();

        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();
        teclado.nextLine(); 

        System.out.println("Digite sua naturalidade de nascimento");
        String naturalidade = teclado.nextLine();

        System.out.println("Deseja visualizar dados completos? (S/N)");
        char visualizarDadosCompletos = teclado.next().charAt(0);

        if (visualizarDadosCompletos == 'S' || visualizarDadosCompletos == 's') {
            System.out.printf("Nome: %s %s\n", nome, sobrenome);
            System.out.printf("Idade: %d\n", idade);
            System.out.printf("Naturalidade: %s\n", naturalidade);
        } else if (visualizarDadosCompletos == 'N' || visualizarDadosCompletos == 'n') {
            System.out.printf("Nome: %s\n", nome);
            System.out.printf("Idade: %d\n", idade);
        } else {
            System.out.println("Digitação errada. Tente novamente!");
        }

        teclado.close();


    }
}
