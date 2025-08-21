import java.util.Scanner;
import java.lang.Math;

public class LocalizaCaractere {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palavra = "";
		
		String caractere = "";
		
		int decisao = 1;
		
		int i;
		
		while (decisao == 1) {
		
		    System.out.print("Qual a palavra? ");
		    palavra = sc.next().toUpperCase();
		   
		    System.out.print("Qual caractere? ");
		    caractere = sc.next().toUpperCase();
		   
		    System.out.println("Letras da palavra:");
		   
           for(i = 0; i < palavra.length(); i++) {
           	
               System.out.print(palavra.charAt(i) + " ");
              
           }
          
           char[] vet = new char[palavra.length()];
          
           for (i = 0; i < palavra.length(); i++) {
           	
               vet[i] = palavra.charAt(i);
              
           }
          
           System.out.println();
           System.out.println("Verificando: ");
          
           for (i = 0; i < palavra.length(); i++) {
           	
               if(caractere.charAt(0) == vet[i]) {
               	
               	System.out.println("A localizacao do caractere " + caractere + " é " + i);
               	
               	break;
               	
               }
              
           }
          
           System.out.println();
		   
		    System.out.print("Continuar a pesquisa? S(1) N(2): ");
		    decisao = sc.nextInt();
		   
		}
		
		
	}
}
