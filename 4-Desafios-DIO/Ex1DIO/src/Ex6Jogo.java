// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

        // 1 - Flecha -> Pedra
        // 2 - Escudo -> Papel
        // 3 - Espada -> Tesoura
        
        import java.util.Scanner;  

        public class Ex6Jogo {  
            public static void main(String[] args){  
        
                Scanner leitor = new Scanner(System.in);  
        
                int jogadaJogador, jogadaInimigo;
        
                 jogadaJogador = leitor.nextInt();  
                 jogadaInimigo = leitor.nextInt();  
        
                 if (jogadaJogador == jogadaInimigo) {
                            System.out.println("Empatou");
                         } else if ((jogadaJogador == 1) && (jogadaInimigo == 2)){
                            System.out.println("Perdeu");
                         } else if ((jogadaJogador == 1) && (jogadaInimigo == 3)){
                            System.out.println("Ganhou");
                         } else if ((jogadaJogador == 2) && (jogadaInimigo == 1)){
                            System.out.println("Ganhou");
                         } else if ((jogadaJogador == 2) && (jogadaInimigo == 3)){
                            System.out.println("Perdeu");
                         } else if ((jogadaJogador == 3) && (jogadaInimigo == 1)){
                            System.out.println("Perdeu");
                         } else if  ((jogadaJogador == 3) && (jogadaInimigo == 2)){
                            System.out.println("Ganhou");
                         }

             leitor.close();
             }
        }