import java.util.Scanner;

/* Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: imprimindo a nota o conceito de um aluno.
* Descrição: 5. Faça um programa para imprimir o conceito de um aluno. O conceito é calculado em função da nota do aluno 
  que varia de 0  a 100. As faixas da correlação são mostradas abaixo:
     * Nota Conceito: * 0 a 49 Insuficiente
                      * 50 a 64 Regular
                      * 65 a 84 Bom
                      * 85 100 Ótimo
* Data: 09/04/2023 */

public class Atividade05 {

    public static void main(String[] args) throws Exception {

        Double nConceito;
        Scanner s = new Scanner(System.in);

        System.out.print("Qual a sua nota conceito? ");
        nConceito = s.nextDouble();

        if (nConceito >= 0 && nConceito <= 49) {
            // 0 a 49 Insuficiente
            System.out.println("> Sua nota conceito é INSUFICIENTE.");
        } else if (nConceito >= 50 && nConceito <= 64) {
            // 50 a 64 Regular
            System.out.println("> Sua nota conceito é REGULAR.");
        } else if (nConceito >= 65 && nConceito <= 84) {
            // 65 a 84 Bom
            System.out.println("> Sua nota conceito é BOA.");
        } else if (nConceito >= 85 && nConceito <= 100) {
            // 85 a 100 Ótimo
            System.out.println("> Sua nota conceito é ÓTIMA! PARABÉNS! ");
        } else {
            System.out.println("Digite uma nota conceito no intervalo de 0 a 100.");
        }

        s.close();
    }

}
