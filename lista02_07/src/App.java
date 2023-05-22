/* Nome do Aluno: Ana Vitoria Cezar
 * RA: 12723128506 
 * Nome do programa: Pratica 2 exercicio 07
 * Faça um programa calcula o total de uma hospedagem em um
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.
*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira a diária");
        double diaria = teclado.nextDouble();
       
        double valorDaDiaria = 60.00;
        double taxaDeServico = 0;
        

        if (diaria > 15) {
           taxaDeServico = 5.50;
            
        } else if (diaria == 15){
           taxaDeServico =  6.00;
            
        } else {
           taxaDeServico = 8.00;
        } 

        double totalDaHospedagem = diaria * (taxaDeServico + valorDaDiaria);
         
         System.out.printf("O valor total da hospedagem é R$ : %.2f", totalDaHospedagem);
       
    }
}
