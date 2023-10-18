import java.util.Scanner;

class employee {
    int age;
    int salary;
    int phnum;
    String name;
    String add;

    void printSalary() {
        System.out.println("name: " + name + "\nsalary: " + salary);
    }
}

class officer extends employee {
    String specialization;
    String department;

    void display() {
        System.out.println("age: " + age + "\nphone number: " + phnum + "\naddress: " + add
                + "\nspecialization: " + specialization + "\ndepartment: " + department);
    }
}

class manager extends employee {
    String specialization;
    String department;

    void display() {
        System.out.println("age: " + age + "\nphone number: " + phnum + "\naddress: " + add
                + "\nspecialization: " + specialization + "\ndepartment: " + department);
    }
}

public class emp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        officer ob = new officer();
        System.out.println("Enter officer's details:");
        System.out.print("Name: ");
        ob.name = input.nextLine();
        System.out.print("Age: ");
        ob.age = input.nextInt();
        System.out.print("Salary: ");
        ob.salary = input.nextInt();
        System.out.print("Phone Number: ");
        ob.phnum = input.nextInt();
        input.nextLine(); // Consume the newline character
        System.out.print("Address: ");
        ob.add = input.nextLine();
        System.out.print("Specialization: ");
        ob.specialization = input.nextLine();
        System.out.print("Department: ");
        ob.department = input.nextLine();

        System.out.println();

        manager obj = new manager();
        System.out.println("Enter manager's details:");
        System.out.print("Name: ");
        obj.name = input.nextLine();
        System.out.print("Age: ");
        obj.age = input.nextInt();
        System.out.print("Salary: ");
        obj.salary = input.nextInt();
        System.out.print("Phone Number: ");
        obj.phnum = input.nextInt();
        input.nextLine(); // Consume the newline character
        System.out.print("Address: ");
        obj.add = input.nextLine();
        System.out.print("Specialization: ");
        obj.specialization = input.nextLine();
        System.out.print("Department: ");
        obj.department = input.nextLine();

        input.close();

        System.out.println("\nOfficer's Details:");
        ob.printSalary();
        ob.display();

        System.out.println("\nManager's Details:");
        obj.printSalary();
        obj.display();
    }
}
