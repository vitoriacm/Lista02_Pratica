import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite o Valor A");
        int numeroA = teclado.nextInt();
        System.out.println("Digite o valor B");
        int numeroB = teclado.nextInt();

        teclado.close();


        if (numeroA % numeroB == 0 || numeroB % numeroA == 0) {

            System.out.println("É multiplo");
            
        } else {
            System.out.println("Não é multiplo");
            
        }
    }
}
