package oops.interfaces;

interface bicycle {
    void applyBrake(int decrement);

    void speedup(int increment);

}

class Avon implements bicycle {
    int speed = 10;

    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    public void speedup(int increment) {
        speed = speed + increment;
    }
}

public class basics {
    public static void main(String[] args) {
        Avon myBike = new Avon();
        myBike.speedup(5);
        myBike.applyBrake(2);
        System.out.println("Current speed: " + myBike.speed);

    }
}
