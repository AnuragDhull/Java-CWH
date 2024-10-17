package oops.constructors;

class Employee4 {
    String name;
    int id;

    public Employee4() {
        id = 420;
        name = "Anurag";
    }

    public Employee4(String myName, int myId) {
        name = myName;
        id = myId;

    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        // Creating emp1 using default constructor
        Employee4 emp1 = new Employee4();
        System.out.println("Employee 1 Name: " + emp1.getName());
        System.out.println("Employee 1 ID: " + emp1.getId());

        // Creating emp2 using parameterized constructor
        Employee4 emp2 = new Employee4("Anurag", 420);
        System.out.println("Employee 2 Name: " + emp2.getName());
        System.out.println("Employee 2 ID: " + emp2.getId());
    }
}
