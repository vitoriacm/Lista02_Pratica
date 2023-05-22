public class App {
    public static void main(String[] args) throws Exception {
     int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }

        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}
