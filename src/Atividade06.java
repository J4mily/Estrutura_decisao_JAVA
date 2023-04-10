import java.util.Scanner;

/* Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: calculo do total de uma hospedagem em um hotel. 
* Descrição: 6.Faça um programa calcula o total de uma hospedagem em um hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
     * R$ 5.50 por diária, se o número de diárias for maior que 15;
     * R$ 6.00 por diária, se o número de diárias for igual a 15;
     * R$ 8.00 por diária, se o número de diárias for menor que 15.
* Data: 09/04/2023 */

public class Atividade06 {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        System.out.print("Qual a quantidade de diária que vc vai pegar? ");
        int ndiaria = s.nextInt();

        if(ndiaria > 15){
            System.out.println("> A taxa de hospedagem vai ser de: " + (60 + (ndiaria * 5.5)));
        } else if(ndiaria == 15){
            System.out.println("> A taxa de hospedagem vai ser de: " + (60 + (ndiaria * 6)));
        }else if(ndiaria < 15 && ndiaria >= 0){
            System.out.println("> A taxa de hospedagem vai ser de: " + (60 + (ndiaria * 8)));
        }else {
            System.out.println("Número de dias inválido");
        }

         s.close();
    }
}
