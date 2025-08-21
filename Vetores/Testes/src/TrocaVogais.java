import java.util.Arrays;
import java.util.Scanner;


public class TrocaVogais {
   public static void main(String[] args) {


       Scanner sc = new Scanner(System.in);


       String[] vogais = {"A", "E", "I", "O", "U"};


       int i=0;
       int decisao = 1;


       int origem = 0;
       int destino = 0;
       String temp;


       while(decisao==1) {


           System.out.println("Vetor atual: " + Arrays.toString(vogais));


           System.out.print("Qual elemento voce quer pegar: ");
           origem = sc.nextInt();


           System.out.print("Qual elemento voce quer substituir: ");
           destino = sc.nextInt();


           temp = vogais[origem];
           vogais[origem] = vogais[destino];
           vogais[destino] = temp;


           System.out.println("Vetor trocado: " + Arrays.toString(vogais));


           System.out.print("Continuar programa: SIm(1) Nao(2): ");
           decisao = sc.nextInt();


           System.out.println();


       }


   }
}
