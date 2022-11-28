import java.util.Scanner;

public class Ex1MediaIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade1;
        int idade2;
        int idade3;
        int media;

        System.out.println("Idade: ");
        idade1 = scan.nextInt();
        idade2 = scan.nextInt();
        idade3 = scan.nextInt();

        if (media >= 0 && media <= 25){
            System.out.println("Esta turma é Jovem");
            } else if (media >= 26 && media <= 60){
            System.out.println("Esta turma é Adulta");
            }else{
               System.out.println("Esta turma é Idosa");
            }
}
}