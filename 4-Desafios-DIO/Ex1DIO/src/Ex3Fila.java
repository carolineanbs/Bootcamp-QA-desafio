// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner; 
 
public class Ex3Fila { 
 
    public static void main(String[] args) { 
 
    String[] nomesFila = new String[3]; 
    Scanner nome = new Scanner(System.in); 
    String pessoa;
    
    
    for (int i=0; i< nomesFila.length; i++){
      int j = i+1;
      pessoa = nome.nextLine();
      nomesFila[i] = pessoa;
      System.out.println(pessoa + " - esta na posicao: " + j );
    }

    nome.close();
  
  } 
}