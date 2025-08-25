import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


public class Empresa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario f1 = new Funcionario("Carlos", 32, 5500.00);
        Funcionario f2 = new Funcionario();

        f1.setSalario(-2000);

        System.out.println("Funcionario 1: ");
        f1.exibirDados();

        System.out.println();

        f2.setNome("Ana");
        f2.setIdade(25);
        f2.setSalario(4800);

        f2.setNome("An");

        System.out.println("Funcionário 2:");
        f2.exibirDados();
        
    }

}

