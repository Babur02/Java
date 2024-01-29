import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// Fifo
// PriorityQueue implements Queue(Interface)
// DeQueue(Interface) extends Queue, ArrayDeque implements Dequeue

public class QueueCollection {
    public static void main(String[] args) {
        // Queue implementation by LinkedList
        Queue<Integer> queue = new LinkedList<>();
        // offer()=add(), poll()=remove()
        // add() remove() may throw exception
        // offer() returns true if value is passed in Queue else false
        // poll() returns null value
        queue.add(12);
        queue.offer(20);
        queue.offer(10);
        queue.add(15);
        System.out.println("Queue " + queue);
        System.out.println("Q remove " + queue.remove());
        System.out.println("Queue " + queue);
        System.out.println("Q poll " + queue.poll());
        System.out.println("Queue " + queue);
        System.out.println("Q offer " + queue.offer(5));
        System.out.println();

        // ArrayDequeue
        Deque<Integer> aDeque = new ArrayDeque<>();
        aDeque.offer(10);
        aDeque.offer(5);
        aDeque.offerFirst(2);
        aDeque.offerLast(20);
        aDeque.pollLast();
        System.out.println("Dequeue " + aDeque);
        System.out.println();

        // PriorityQueue byDefault=min; if want 2nd largest then delete one
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(5);
        pq.add(10);
        pq.add(2);
        System.out.println("Priority Queue " + pq);
        System.out.println("Priority Queue peek " + pq.peek());

    }
}
