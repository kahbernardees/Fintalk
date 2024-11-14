import java.util.Scanner;

public class VerificadorDePalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();
        
        if (ehPalindromo(entrada)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
        
        scanner.close();
    }
    
    public static boolean ehPalindromo(String str) {
    
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        
        StringBuilder strInvertida = new StringBuilder(str);
        strInvertida.reverse();
        
        
        return str.equals(strInvertida.toString());
    }
}
