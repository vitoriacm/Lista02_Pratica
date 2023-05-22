public class App {
    public static void main(String[] args) throws Exception {
        int numero = 1;
        int soma = 0;

        while (numero <= 100) {
            soma += numero;
            numero++;
        }

        System.out.printf("O valor total da soma é: %d ",soma);
    }
}
