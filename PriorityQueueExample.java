import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //--------Adding elements-----------
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Queue is: "+pq);

        //------------adding  using offer  method
        System.out.println("Adding using offer: "+pq.offer(25));

        //--Remove and print root element--
        System.out.println("Deleted: "+pq.poll()); //output 10
        System.out.println("Deleted: "+pq.poll()); //output 20

        //peek element
        System.out.println("Element on the root: "+pq.peek());

        //remove 
        System.out.println("Removed: "+pq.remove());

        //empty
        System.out.println(""+pq.isEmpty());

        //clear
        pq.clear();
        System.out.println(pq);
    }
}
