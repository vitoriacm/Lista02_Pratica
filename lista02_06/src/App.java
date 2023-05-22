import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Digite a Nota");
        int Conceito = teclado.nextInt();

        teclado.close();

      if (Conceito >= 0 && Conceito <= 49) {
        System.out.println("Insuficiente");
        
      } else if (Conceito >= 50 && Conceito <=64) {
        System.out.println("Regular");
        
      } else if (Conceito >= 65 && Conceito <= 84 ){
        System.out.println("Bom");
      } else if (Conceito >= 85 && Conceito <= 100){
        System.out.println("Otimo ");
       }

    System.out.printf("Conceito %d", Conceito);
   

    }
}
