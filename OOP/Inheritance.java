package OOP;

public class Inheritance {
    public static void main(String[] args) {
        DadaG d = new DadaG();
        System.out.println("DadaG = " + d.name + " " + d.surname);
        Father f = new Father();
        System.out.println("Father = " + f.name + " " + f.surname);
        Me m = new Me();
        System.out.println("Me = " + m.name + " " + m.surname);
        Bhai b = new Bhai();
        System.out.println("Bhai = " + b.name + " " + b.surname);
    }
}

class DadaG {
    String name = "Babar";
    String surname = "Qureshi";
}

class Father extends DadaG {
    String name = "Humayun";
}

class Me extends Father {
    String name = "Akbar";
}
// Hierarchical
class Bhai extends Father { 
    String name = " SRK";
}