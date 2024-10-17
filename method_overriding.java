package oops.inheritence;

class A {
    public void met1() {
        System.out.println("ram ram bhai");
    }

    public void met2() {
        System.out.println("This is method of class A");
    }
}

class B extends A {
    public void met3() {
        System.out.println("yoyoooo !!");
    }

    public void met2() {
        System.out.println("tjhis is method of class b ");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.met1();
        a.met2();
        b.met3();
        b.met2();
    }
}
