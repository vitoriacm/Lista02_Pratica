public class App {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        
        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero % 7 != 0);
    }
}
