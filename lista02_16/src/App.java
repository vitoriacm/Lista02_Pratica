public class App {
    public static void main(String[] args) throws Exception {
          Scanner teclado = new Scanner(System.in);

        int numero = 0;

        while (numero >= 0) {
            System.out.print("Digite um número (digite um número negativo para sair): ");
            numero = teclado.nextInt();
        }

        System.out.println("Número digitado é menor que 0. Fim do programa.");
        
        teclado.close();
    }
}
