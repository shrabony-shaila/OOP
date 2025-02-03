import java.util.Scanner;
public class Employee{
    String name;
    int age;
    double salary;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Employee Shrabony = new Employee();
        System.out.print("Enter employee name: ");
        Shrabony.name = input.nextLine();
        System.out.print("Enter employee age: ");
        Shrabony.age = input.nextInt();
        System.out.print("Enter employee salary: ");
        Shrabony.salary = input.nextDouble();
        System.out.println("Employee name: " + Shrabony.name);
        System.out.println("Employee age: " + Shrabony.age);
        System.out.println("Employee salary: " + Shrabony.salary);


    }
}