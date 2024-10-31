package queues;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.IntStream;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>();

        System.out.println(q.peek());

        IntStream.rangeClosed(20, 30).forEach(q::offer);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);




    }
}
