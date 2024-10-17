package oops.inheritence;

class Phone {
    public void ring() {
        System.out.println("ringggggg");
    }

    public void call() {
        System.out.println("callllllll");
    }
}

class Smartphone extends Phone {
    public void camera() {
        System.out.println("kichhhhhh");
    }

    public void gaming() {
        System.out.println("rattttatatat");
    }
}

public class dynamic_memory_dispatch {
    public static void main(String[] args) {
        // Dynamic memory dispatch

        Phone obj1 = new Smartphone();
        obj1.call();

        // Smartphone obj2 =new Phone(); not allowed

    }
}
