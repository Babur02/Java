public class FirstClass {
    public static void main(String[] args) {
        // public is access specifier that defines visibility
        /*
         * Generally we call method by creating an object of its class but static method
         * can be called without using object. The JVM calls the main method prior to
         * the creation of any object thats why we need to declare it as static
         */
        // The return type void signifies that method doesnt returns anything.
        /*
         * String[] args is a parameter that accepts string type arguments. it is
         * command line argument i.e. arg passed at the time of running java programme.
         */
        System.out.println("Hello G");

        // Upper Type Casting             byte->short->char->int->long->float->double      Wide Casting
        double d = 10.45f;
        System.out.println(d);
        // Down Type Casting              double->float->long->int->char->short->byte      Narrow Casting
        double n = 3.5;
        int m = (int) n;
        System.out.println(m);         
            
    }

}
// The File name must have the same name as the public class name in that
// file,which is the way to tell jvm that this is an entry point

// Java is not pure oop because it supports primitive data type like int,byte
// which are not objects.

// Java is static typed language as it expects variable to be declared before
// they can be assigned values,type checking is done at compile time

// When a func is called,the values that are passed during the call are called
// as Arguments=value
// The values which are defined at the time of definition of function are called
// Parameters= Data type & Value
