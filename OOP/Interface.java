package OOP;

public class Interface {
    public static void main(String[] args) {
        Director d = new Director();
        d.salman();
    }
}

interface Kick {
    void salman();
    // Declares only
}

class Director implements Kick {
    public void salman() {
        System.out.println("Boom");
    }
}