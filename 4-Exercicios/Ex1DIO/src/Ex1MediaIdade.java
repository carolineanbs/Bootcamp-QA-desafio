import java.util.Scanner;

public class Ex1MediaIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade1;
        int idade2;
        int idade3;

        System.out.println("Idade: ");
        idade1 = scan.nextInt();
        idade2 = scan.nextInt();
        idade3 = scan.nextInt();

        if (idade1 <= 39) {
            System.out.println("Esta turma é Jovem, tem: " + idade1 + " anos. ");
        } else if ( idade1 >= 40) {
            System.out.println("Esta turma é Idosa, tem: " + idade1 + " anos. ");
        }

        if (idade2 <= 39) {
            System.out.println("Esta turma é Jovem, tem: " + idade2 + " anos. ");
        } else if ( idade2 >= 40) {
            System.out.println("Esta turma é Idosa, tem: " + idade2 + " anos. ");
        }

        if (idade3 <= 39) {
            System.out.println("Esta turma é Jovem, tem: " + idade3 + " anos. ");
        } else if ( idade3 >= 40) {
            System.out.println("Esta turma é Idosa, tem: " + idade3 + " anos. ");
        }

 
 
    }
}