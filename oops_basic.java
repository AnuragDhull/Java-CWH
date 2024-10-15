package oops;

class Employee {
    int id;
    String name;

    public void printdetails() {
        System.out.println("My name is  " + name);
        System.out.println("my id is " + id);
    }
}

public class oops_basic {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.id = 10;
        emp.name = "Anurag";

        // System.out.println(emp.id);
        // System.out.println(emp.name);

        emp.printdetails();

    }
}
