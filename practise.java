abstract class pen {
    abstract public void write();

    abstract public void refill();

}

class fountain extends pen {
    public void write() {
        System.out.println("writinggg !!");
    }

    public void refill() {
        System.out.println("fillllinggggg");
    }

    public void changeRefill() {
        System.out.println("changinggg ");
    }

}

public class practise {
    public static void main(String[] args) {
        fountain f1 = new fountain();

        f1.changeRefill();
        f1.write();
        f1.refill();

    }
}
