public class Employ2 {
    String name;
    int age;
    double salary;
    void insertData(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salaey = salary;
    }
    public static void main(String[] args){
    //Direct value assign
    Employ2 Shaila = new Employ2();
    Shaila.insertData("Shaila", 25, 50000.0);
    System.out.println("Employe2 name: " + Shaila.name);
    System.out.println("Employe2 age: " + Shaila.age);
    System.out.println("Employe2 salary: " + Shaila.salary);
    Scanner input = new Scanner(System.in);
    //usind scanner
    Employ2 Sathi = new Employ2();
    System.out.print("Enter employee name: " );
    Sathi.name = input.nextLine();
    System.out.print("Enter employee age: " );
    Sathi.name = input.nextLInt();
    System.out.print("Enter employee salary: " );
    Sathi.name = input.nextDouble();


    }

    
}
