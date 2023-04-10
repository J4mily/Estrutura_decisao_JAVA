import java.util.Scanner;

/* Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Par ou ímpar? Positivo ou negativo?
* Descrição: 3. Faça um programa que peça um número e retorne se ele é par ou ímpar ou se é positivo ou negativo.
* Data: 09/04/2023 */

public class Atividade03 {

    public static void main(String[] args) throws Exception {

    Scanner s = new Scanner(System.in);

    System.out.println("Digite um número para saber se é impar ou par:");
    int numero = s.nextInt();
    s.close();

    if (numero % 2 == 0) {
        System.out.print("> O número é PAR");
    } else {
        System.out.print("> O número é ÍMPAR");
    }

    if (numero > 0) {
        System.out.print(" e POSITIVO");
    } else if (numero == 0) {
        System.out.print(" e NEUTRO");
    } else {
        System.out.print(" e NEGATIVO");
    }
}

}
