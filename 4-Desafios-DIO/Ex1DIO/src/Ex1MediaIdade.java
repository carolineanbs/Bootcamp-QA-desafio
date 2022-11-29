import java.util.Scanner;

public class Ex1MediaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int idade1, idade2, idade3, media;
		
		
		System.out.println("Digite suas idades:");
		System.out.print("Idade 1: "); idade1 = sc.nextInt(); 
		System.out.print("Idade 2: "); idade2 = sc.nextInt();
		System.out.print("Idade 3: "); idade3 = sc.nextInt();
		System.out.println();
		
		media = (idade1 + idade2 + idade3)/3;
		
		if(media >= 0 && media <=25) {
			System.out.println("Jovem!");
		}else if(media >= 26 && media <= 60) {
			System.out.println("Adulta!");
		}else {
			System.out.println("Idosa!");
		}
		
		sc.close();
}
}