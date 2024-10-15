package oops;

class Smartphone {
    public void ring() {
        System.out.println("Ringingggggg....");
    }

    public void call() {
        System.out.println("callingggggg.....");
    }
}

public class oops_prac1 {
    public static void main(String[] args) {
        Smartphone apple = new Smartphone();

        apple.ring();
        apple.call();
    }
}
