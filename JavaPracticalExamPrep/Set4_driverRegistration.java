

import java.util.*;

class InvalidAgeException extends Exception {
    public void printError() {
        System.err.println("Underage!!");
    }
}

class Driver {

    String id, name;
    static int driverCount;

    Driver() {
        System.out.println("Driver class constructor called");
    }

    Driver(String id, String name) {
        driverCount++;
        this.id = id;
        this.name = name;
        System.out.println("Driver class parameterized constructor called");
    }

    public void printdetails() {
        System.out.println("\n");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class CabDriver extends Driver {
    int age;
    String vehicleNumber, address;

    CabDriver() {
        super();
        System.out.println("CabDriver class constructor called");
    }

    CabDriver(String id, String name, int age, String vehicleNumber, String address) {
        super(id, name);
        this.age = age;
        this.vehicleNumber = vehicleNumber;
        this.address = address;
        System.out.println("CabDriver class parameterized constructor called");
    }

    public void printdetails() {
        super.printdetails();
        System.out.println("Age:" + age);
        System.out.println("Vehicle Number:" + vehicleNumber);
        System.out.println("address:" + address);
        System.out.println("Number of Total Drivers: " + driverCount);
    }

}

public class Set4_driverRegistration {
    public static void main(String[] args) throws InvalidAgeException, NoSuchElementException {

        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter ID:");
                String id = sc.nextLine();

                System.out.println("Enter Name:");
                String name = sc.nextLine();

                System.out.println("Enter Age:");
                int age = Integer.parseInt(sc.nextLine());

                if (age < 18) {
                    throw new InvalidAgeException();
                }

                System.out.println("Enter Vehicle Number:");
                String vehicleNumber = sc.nextLine();

                System.out.println("Enter Address:");
                String address = sc.nextLine();

                CabDriver driver = new CabDriver(id, name, age, vehicleNumber, address);
                driver.printdetails();

                System.out.println("\nPress Ctrl + C to exit...\n");
            }
        } catch (InvalidAgeException e) {
            e.printError();
        } catch (NoSuchElementException e) {
            System.out.println("Exiting...");
        } finally {
            sc.close();
        }

    }
}
