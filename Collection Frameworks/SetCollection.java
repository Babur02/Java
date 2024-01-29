import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// (class)Hashset,LinkedHashSet implements Set
// SortedSet extends Set, TreeSet implements SortedSet
public class SetCollection {
    public static void main(String[] args) {
        // HashSet is unordered doesnt allow duplicate value
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println("Hashset " + hashSet);

        // LinkedHashSet is ordered doesnt allow duplicate value
        LinkedHashSet<Integer> lHashSet = new LinkedHashSet();
        lHashSet.add(20);
        lHashSet.add(10);
        lHashSet.add(20);
        lHashSet.add(30);
        System.out.println("LinkedHashSet " + lHashSet);

        // (Sorted,unique)
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(0);
        treeSet.add(5);
        System.out.println("TreeSet " + treeSet);

    }
}
