import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(2);
        System.out.println("HashSet 1: "+numbers);
        
        HashSet<Integer> number1= new HashSet<>();
        number1.add(21);
        number1.add(12);
        number1.add(111);
        System.out.println("HashSet 2: "+number1);
        
        //union- addall ,intersection- retainall,difference- removeall
        number1.addAll(numbers);
        System.out.println("After union Set2: "+number1);

        number1.retainAll(number1);
        System.out.println("After intersection Set2: "+number1);

        number1.removeAll(number1);
        System.out.println("Ater difference Set2 "+number1);
    }
}
