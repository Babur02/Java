package OOP;
public class Abstraction {
    public static void main(String[] args) {
        Admin a = new Admin();
        a.write();

    }
}

abstract class Abbstraction {
    String name;

    void read() {

    }

    abstract void write();
}

class Admin extends Abbstraction {
    void write() {
        System.out.println("write");
    }
}

// Abstraction(implementation hiding) can be achieved in two ways 1.Abstract
// method 2.Interface
// 100% achieve by interface