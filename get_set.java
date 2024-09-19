class Employee {
    private int id;
    private String name;

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

public class get_set {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Anurag");
        emp.setId(10);
        System.out.println(emp.getName());
        System.out.println(emp.getId());
    }
}
