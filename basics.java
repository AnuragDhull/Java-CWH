abstract class Parent2 {
    public void meet() {
        System.out.println("heeeye");
    }

    abstract public void greet();

}

class Child2 extends Parent2 {
    public void greet() {
        System.out.println("ram ram ji");
    }
}

public class basics {
    public static void main(String[] args) {
        Child2 c = new Child2();

        // Parent2 p= new Parent2() ;
        // abstract class cant be initiated

        c.greet();
        c.meet();
    }
}