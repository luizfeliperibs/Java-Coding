import java.util.Scanner;

public class CPF {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Digite o CPF (somente os 11 dígitos): ");
       String entrada = sc.nextLine();
       
       String[] cpf = new String[11];
      
       for (int i = 0; i < 11; i++) {
           cpf[i] = String.valueOf(entrada.charAt(i));
       }
      
       String[] invertido = new String[9];
      
       for (int i = 0; i < 9; i++) {
           invertido[i] = cpf[8 - i];
       }
      
       System.out.println("CPF invertido: ");
       for (int i = 0; i < 9; i++) {
           System.out.print(invertido[i]);
       }
      
       sc.close();
   }
}
