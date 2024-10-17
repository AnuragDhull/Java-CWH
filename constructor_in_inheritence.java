package oops.inheritence;

class base {
    public base() {
        System.out.println("i am constructor of base class");
    }
}

class derived extends base {
    public derived() {
        System.out.println("i am constructor of derived class ");
    }
}

public class constructor_in_inheritence {
    public static void main(String[] args) {
        base b = new base();

        derived d = new derived();
    }
}
