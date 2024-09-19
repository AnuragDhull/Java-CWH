public class methods_overloading {

    static void foo() {
        System.out.println("ram ram ji");
    }

    static void foo(String a) {
        System.out.println("ram ram " + a + " ji");
    }

    public static void main(String[] args) {
        foo();
        foo("anurag");

    }
}
