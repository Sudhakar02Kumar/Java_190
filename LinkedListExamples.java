import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> employee = new LinkedList<>();

        // Adding elements
        employee.add("John");              // Add normally
        employee.add(1, "Emma");           // Add at index 1 (after "John")
        employee.addFirst("Sophia");       // Add at first position
        employee.addLast("Arjun");         // Add at last position

        // Printing LinkedList
        System.out.println("Employee after adding: " + employee);

        System.out.println(2,"");
    
    }
}