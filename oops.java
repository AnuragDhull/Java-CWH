class Employee {
    int id;
    String name;

    public void printdetails() {
        System.out.println(id);
        System.out.println(name);
    }
}

public class oops {
    public static void main(String[] args) {

        Employee anurag = new Employee(); // inatiating object of employee class
        Employee john = new Employee();
        // setting attributes
        anurag.id = 69;
        anurag.name = "Jaat";

        john.id = 70;
        john.name = "pandat";

        System.out.println(anurag.id);
        System.out.println(anurag.name);
        anurag.printdetails();
        john.printdetails();

    }
}
