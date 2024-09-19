class Employee {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }
}

public class oops_practice_1 {
    public static void main(String[] args) {

        Employee harry = new Employee();

        harry.setname("anurag");
        System.out.println(harry.getname());

    }
}
