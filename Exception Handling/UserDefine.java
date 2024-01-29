class QureshiException extends Exception {
   void QureshiException(int age) {
        if (age < 18)
            try {
                throw new Exception("Age not valid");
            } catch (Exception e) {
                System.out.println("a");
            }
    }
}

public class UserDefine {
    public static void main(String[] args) throws Exception {
        QureshiException q = new QureshiException();
        q.QureshiException(12);
    }
}
