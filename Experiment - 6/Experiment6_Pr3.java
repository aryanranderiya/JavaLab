abstract class Employee {
    abstract void calculateSalary();

    abstract void displayInfo();
}

class Manager extends Employee {

    String name;
    float salary;
    int months;
    float totalSalary;

    Manager(String name, float salary, int months) {
        this.name = name;
        this.salary = salary;
        this.months = months;
    }

    void calculateSalary() {
        this.totalSalary = salary * months;
    }

    void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager Salary: " + salary);
        System.out.println("Manager Tenure: " + months);
        System.out.println("Manager Total Salary: " + totalSalary);
        System.out.println();
    }
}

class Programmer extends Employee {

    String name;
    float salary;
    int months;
    float totalSalary;

    Programmer(String name, float salary, int months) {
        this.name = name;
        this.salary = salary;
        this.months = months;
    }

    void calculateSalary() {
        this.totalSalary = salary * months;
    }

    void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Programmer Salary: " + salary);
        System.out.println("Programmer Tenure: " + months);
        System.out.println("Programmer Total Salary: " + totalSalary);
        System.out.println();
    }
}

public class Experiment6_Pr3 {

    public static void main(String[] args) {
        Manager manager = new Manager("Manager Aryan", 10000, 12);
        Programmer programmer = new Programmer("Programmer Aryan", 10000, 12);

        manager.calculateSalary();
        manager.displayInfo();

        programmer.calculateSalary();
        programmer.displayInfo();
    }
}
