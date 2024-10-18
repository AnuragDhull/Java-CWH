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

public class default_methods {
    public static void main(String[] args) {
        smartphone apple = new smartphone();
        apple.pickCall();
        apple.callNumber(8168);
        apple.recordVideo();
        apple.connectToNetwork();
    }
}
