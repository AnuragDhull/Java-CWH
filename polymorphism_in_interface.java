package oops.interfaces;

interface camera {
    void takeSnap();

    void recordVideo();

    default void extra() {
        System.out.println("extra");
    }
}

interface wifi {

    void connectToNetwork();
}

class cellphone {
    void callNumber(int phoneNumber) {
        System.out.println("pickingggg + " + phoneNumber);
    }

    void pickCall() {
        System.out.println("pickingggg ");
    }
}

class smartphone extends cellphone implements wifi, camera {
    public void takeSnap() {
        System.out.println("kichikk !!");
    }

    public void recordVideo() {
        System.out.println("actionnnn !!");
    }

    public void getNetworks() {
        System.out.println("list of networksss");
    }

    public void connectToNetwork() {
        System.out.println("connected to :-- ");
    }

}

public class polymorphism_in_interface {
    public static void main(String[] args) {

        camera cam1 = new smartphone();

        cam1.recordVideo(); // allowed
        cam1.takeSnap(); // allowed

        // cam1.pickCall(); not allowed

        // if u want o use all methods then use
        smartphone s1 = new smartphone();

        s1.recordVideo();
        s1.pickCall();

    }
}
