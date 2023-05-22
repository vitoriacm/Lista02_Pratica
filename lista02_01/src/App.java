import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
      
        System.out.println("Digite o primeiro  numero");
        int numeroA = teclado.nextInt();
        
        System.out.println("Digite o segundo numero");
        int numeroB = teclado.nextInt();
  
        teclado.close();
        
        if (numeroA > numeroB){
          System.out.println("O numero "+ numeroA +" É maior que "+ numeroB);
        }
        else {
          System.out.println("O numero "+ numeroB + " É maior que" + numeroA);
        }
      
    }
    
}
