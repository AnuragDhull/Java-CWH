package oops.inheritence;
// constructor overloading and inheritence 

class base1 {
    public base1() {
        System.out.println("i am constructor of base class");
    }

    public base1(String a) {
        System.out.println("construct made by :-- " + a);
    }
}

class derived1 extends base1 {
    public derived1() {
        super("jaat");
        System.out.println("i am constructor of derived class ");
    }
}

public class overloading_cons_inher {
    public static void main(String[] args) {
        // base1 b1=new base1();
        // base1 b2=new base1("jaat");

        derived1 d1 = new derived1();

    }
}
