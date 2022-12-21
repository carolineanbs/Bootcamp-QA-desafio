import java.util.Scanner;

public class Ex2Turno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);
        String M = "M";
        char MC = M.charAt(0);

        String N = "N";
        char NC = N.charAt(0);
        
        String V = "V";
        char VC = V.charAt(0);
        
        
        
        if(turno == MC) {
			System.out.println("Bom Dia!");
		}else if(turno == NC) {
			System.out.println("Boa Noite!");
		}else if(turno == VC) {
			System.out.println("Boa Tarde!");
		}else{
		  System.out.println("Valor Inválido!");
		}
        
        leitor.close();

     
        }
    }