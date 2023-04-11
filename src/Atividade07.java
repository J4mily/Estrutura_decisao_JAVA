import java.util.Scanner;

/* Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Identificando,com base no número digitado, o nome do mês e a estação.
* Descrição:7.Crie um programa que lê um número entre 1 e 12, correspondendo a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
 Ao final, o programa deve imprimir uma mensagem identificando,com base no número digitado, o nome do mês e a estação.
* Data: 09/04/2023 */
public class Atividade07 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 12 relacionado ao mês:");
        int a = s.nextInt();

        if (a == 1) {
            System.out.println("Janeiro - Verão");
        } else if (a == 2) {
            System.out.println("Fevereiro - Verão");
        } else if (a == 3) {
            System.out.println("Março - Verão");
        } else if (a == 4) {
            System.out.println("Abril - Outono");
        } else if (a == 5) {
            System.out.println("Maio - Outono");
        } else if (a == 6) {
            System.out.println("Junho - Inverno");
        } else if (a == 7) {
            System.out.println("Julho - Inverno");
        } else if (a == 8) {
            System.out.println("Agosto - Primavera");
        } else if (a == 9) {
            System.out.println("Setembro - Primavera");
        } else if (a == 10) {
            System.out.println("Outubro - Primavera");
        } else if (a == 11) {
            System.out.println("Novembro - Primavera");
        } else if (a == 12) {
            System.out.println("Dezembro - Primavera");
        } else {
            System.out.println("Não existe esse mês");
        }
        s.close();
    }

}
