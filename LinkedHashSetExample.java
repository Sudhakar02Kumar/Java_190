import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);

        System.out.println("LinkedSet is: "+numbers);
    }
}
