public class App {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = teclado.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        teclado.close();
    }
}
