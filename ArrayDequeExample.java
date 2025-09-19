import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        //create an ArrayDeque of String
        ArrayDeque<String> deque=new ArrayDeque<>();

        //Add element
        deque.add("A");
        deque.addFirst("F");
        deque.addLast("L");

        //add  using offer
        deque.offer("C");
        deque.offerFirst("First");
        deque.offerLast("Last");
        
        System.out.println(deque);

        //Access Element
        System.out.println("First element (peek):  "+deque.peek()); //  same as peekFirst()
        System.out.println("First element (peekFirst): "+deque.peekFirst());
        System.out.println("Last  element (peekLast): "+deque.peekLast());

        //Remove element
        System.out.println("\nRemove elements:");
        System.out.println("Removed first (removeFirst): "+deque.removeFirst());
        System.out.println("Removed last (removedLast): "+deque.removeLast());
        System.out.println("Removed First (pollFirst): "+deque.pollFirst());
        System.out.println("Removed Last (pollLast): "+deque.pollLast());

        System.out.println("Deque after removed:");
        System.out.println(deque);

    }
}
