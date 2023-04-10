import java.util.Scanner;

/* Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Receba como entrada três valores A, B e C e os imprima em ordem crescente.
* Descrição: 4. Faça um programa que leia o nome, o sobrenome, a idade, em anos, e a naturalidade (cidade de nascimento) de uma pessoa.
  Depois, o programa deve dar a seguinte opção “Deseja visualizar dados completos?”. Se o caractere digitado pelo
  usuário for ‘S’ o programa deve imprimir na tela Nome, Sobrenome, idade e naturalidade. Se o caractere digitado pelo
  usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se o caractere não for nenhuma das outras opções acima o programa
  deve imprimir “Digitação errada. Tente Novamente”.
* Data: 09/04/2023 */

public class Atividade04 {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        String nome = s.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = s.nextLine();
        System.out.println("Digite sua idade em anos: ");
        int idade = s.nextInt();
        s.nextLine();
        System.out.println("Digite a sua naturalidade: ");
        String naturalidade = s.nextLine();
         
        System.out.println("Deseja visualizar dados completos? (Digite S para sim e N para não em maiúsculo!) ");
        String visualizar = s.nextLine();
        s.close();

        if (visualizar.equals("S")) {
            System.out.println("> Nome: " + nome);
            System.out.println("> Sobrenome: " + sobrenome);
            System.out.println("> Idade: " + idade);
            System.out.println("> Naturalidade: " + naturalidade);
        } else if (visualizar.equals("N")) {
            System.out.println("> Nome: " + nome);
            System.out.println("> Idade: " + idade);
        } else {
            System.out.println("Digitação errada. Tente Novamente");
        }

    }
}
