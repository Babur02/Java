// Throw allows to create custom error user define exception | Throws used to handle exception
// It is only used for single exception | it can declare multiple exception
// Followed by object | Followed by class
// It is statement | it is write beside method

public class Throw {
    public static void main(String[] args) {
        int age = 18;
        if(age<18)
            try {
                throw new Exception("Age is not vlid");
            } catch (Exception e) {
                System.out.println("s");
            }
    }
}
