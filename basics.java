package oops.constructors;

class Employee3 {
    int id;
    String name;

    public Employee3() {
        // its a constructor
        // u can pass argument in a constructor also
        // (String name,int id) like that
        id = 420;
        name = "jaat";
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

public class basics {
    public static void main(String[] args) {
        Employee3 emp = new Employee3();

        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
