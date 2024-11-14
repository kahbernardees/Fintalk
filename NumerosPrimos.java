import java.util.Scanner;

public class NumerosPrimos {
    // Função para verificar se um número é primo como solicitado no email
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        
        System.out.print("Números primos até " + n + ": ");
        
        
        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
