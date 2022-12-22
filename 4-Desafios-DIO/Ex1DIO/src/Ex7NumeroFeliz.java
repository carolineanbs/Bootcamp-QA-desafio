import java.util.HashSet;
import java.util.Scanner;
 
public class Ex7NumeroFeliz {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int numero;
        do {
            numero = sc.nextInt();
        } while (!(numero >= 0));
 
        HashSet<Integer> numeros = new HashSet<>();
        boolean repetido = false;
 
        while (numero != 1 && !repetido) {
            int[] digitos = devuelveDigitos(numero);
            int suma = 0;
            for (int i = 0; i < digitos.length; i++) {
                suma += Math.pow(digitos[i], 2);
            }
 
            if (!numeros.add(numero)) {
                repetido = true;
            }
 
            numero = suma;
 
        }
 
        if (numero == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
 
    public static int[] devuelveDigitos(int numero) {
        if (numero == 0) {
            int digitos[] = {0};
            return digitos;
        }

        int digitos[] = new int[cuentaCifras(numero)];
        int digito;
        int numeroOriginal = Math.abs(numero);

        for (int i = 0, j = digitos.length - 1, copiaNumero = numeroOriginal; numeroOriginal > 0; i++, j--) {
            copiaNumero /= 10;
            digito = numeroOriginal - (copiaNumero * 10);
            digitos[j] = digito;
            numeroOriginal = copiaNumero;
        }
        return digitos;
    }
 
    public static int cuentaCifras(int num) {
        int contador = 0;
        if (num == 0) {
            contador = 1;
        } else {
            for (int i = Math.abs(num); i > 0; i /= 10) {
                contador++;
            }
        }
        return contador;
        
    }
    
}