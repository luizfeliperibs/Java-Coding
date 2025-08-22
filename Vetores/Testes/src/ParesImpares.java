import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, pares = 0, impares = 0, somapares = 0;
        int[] vet = new int[6];

        for(i=0;i<vet.length;i++){

            System.out.print(i+1 + " numero: ");
            vet[i] = sc.nextInt();

            if(vet[i] % 2 == 0) {
                pares++;
                somapares++;
            } else {
                impares++;
            }

        }

        System.out.println("Numeros pares:");

        for(i=0;i<vet.length;i++){

            if(vet[i] % 2 == 0) {
                System.out.println("Numero " + vet[i] + " na posicao " + (i+1));
            }

        }

        System.out.println("Soma dos pares: " + somapares);

        System.out.println("\nNumeros impares:");

        for(i=0;i<vet.length;i++){

            if(vet[i] % 2 != 0) {
                System.out.println("Numero " + vet[i] + " na posicao " + (i+1));
            }

        }

        System.out.println("Quantidade de impares: " + impares);

    }

}
