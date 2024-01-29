package OOP;

public class Encapsulation {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Employee engineer = new Employee("Babar", 99);
        Employee engineer2 = new Employee("mia", 12);
        System.out.println(engineer.getName());
        System.out.println(engineer.getNo());
        System.out.println(engineer2.getName());
        System.out.println(engineer2.getNo());
        engineer.setName("Dani");
        System.out.println(engineer.getName());
        // System.out.println(engineer.empid);
    }
}

class Employee {
    private int empid = 2;
    private int no;
    private String name;

    Employee(String name, int no) {
        this.name = name;
        this.no = no;
    }

    int getNo() {
        return no;
    }

    String getName() {
        return name;
    }

    void setNo(int no) {
        this.no = no;
    }

    void setName(String name) {
        this.name = name;
    }
}
