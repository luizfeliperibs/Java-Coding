package app;
import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.println();

        System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
        System.out.println();
        System.out.print("Percentage to increase salary: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println(employee);

    }
}
