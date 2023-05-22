/* Nome do Aluno: Ana Vitoria Cezar
 * RA: 12723128506 
 * Nome do programa: Pratica 2 exercicio 01
 * Descrição: Crie um programa que lê um número entre 1 e 12, correspondendo
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
Ao final, o programa deve imprimir uma mensagem identificando,
com base no número digitado, o nome do mês e a estação
 * Data 04/04/23
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int a;

     Scanner teclado = new Scanner(System.in);
     System.out.println("Digite o Mês");
     a = teclado.nextInt();
     teclado.close();

     switch(a){
        case 1: System.out.println("Janeiro - Verão");
                break;
        case 2: System.out.println("Fevereiro - Verão");
                break;
        case 3: System.out.println("Março - Verão");
        break;
        case 4: System.out.println("Abril - outono");
        break;
        case 5: System.out.println("Maio - outono");
        break;
        case 6: System.out.println("Junho - inverno");
        break;
        case 7: System.out.println("Julho - inverno");
        break;
        case 8: System.out.println("agosto - inverno");
        case 9: System.out.println("Setembro - primavera");
        break;
        case 10: System.out.println("outubro - privavera");
        break;
        case 11: System.out.println("Novembro - primavera");
        break;
        case 12: System.out.println("Dezembro - primavera");
        default: System.out.println("Não existe esse mes");

     }

    }
}
