package oops.interfaces;

interface sampleInterface {
    void meth1();

    void meth2();
}

interface childInterface extends sampleInterface {
    void meth3();

    void meth4();
}

class MyClass implements childInterface {
    public void meth1() {
        System.out.println("jaat");
    }

    public void meth2() {
        System.out.println("jaat");
    }

    public void meth3() {
        System.out.println("jaat");
    }

    public void meth4() {
        System.out.println("jaat");
    }
}

public class inheritence_in_interface {
    public static void main(String[] args) {
        MyClass c1 = new MyClass();
        c1.meth1();
        c1.meth2();
        c1.meth3();
        c1.meth4();
    }
}
