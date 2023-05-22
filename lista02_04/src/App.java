import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int numero1 = teclado.nextInt();

        teclado.close();

        if (numero1 % 2 == 0 ){
            System.out.println("É par");
            
        } else {

            System.out.println(" Impar");
            
        } if (numero1 >= 0){
            System.out.println("É Positivo");

        } else {
            System.out.println("É Negativo");
        }

    }
}
