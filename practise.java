package oops.interfaces;

class monkey {
    public void jump() {
        System.out.println("jumppppp");
    }

    public void bite() {
        System.out.println("bittttingggg");
    }
}

interface basicAnimal {
    void eat();

    void sleep();
}

class human extends monkey implements basicAnimal {
    public void eat() {
        System.out.println("eatinggg ");
    }

    public void sleep() {
        System.out.println("slepping !!! ");
    }
}

public class practise {
    public static void main(String[] args) {
        human h1 = new human();

        h1.eat();
        h1.sleep();
        h1.jump();
        h1.bite();
    }
}
