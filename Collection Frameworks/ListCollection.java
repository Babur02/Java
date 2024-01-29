import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

// List is ordered Collection allows duplicate values
// (class)Arraylist,LinkedList,Vector implements List, Stack extends Vector
public class ListCollection {
    public static void main(String[] args) {
        // Arraylist is Non-Sysnchronized thats why its Fast (Not
        // Thread Safe)
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(50);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(1, 12);
        System.out.println("ArrayList " + arrayList);

        // Linked List
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("Linked List " + linkedList);
        linkedList.remove(1);
        System.out.println("Linked List after remove() " + linkedList);

        // Vector is Synchronized thats why its Slow (Thread Safe)
        Vector<String> vector = new Vector<String>();
        vector.add("12");
        vector.add("13");
        vector.add("14");
        System.out.println("Vector " + vector);
        vector.clear();
        System.out.println("Vector after clear() " + vector);

        // Stack (repeat value exists)
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack " + stack);
        System.out.println("Stack peek() " + stack.peek());

        Iterator it = arrayList.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");

            Collections.sort(arrayList);
            System.out.println(arrayList);
    }
}
