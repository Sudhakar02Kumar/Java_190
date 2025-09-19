package clgjava.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {


        HashMap<Integer, String> aiml = new HashMap<>();

        aiml.put(1,"Akash");
        aiml.put(2,"Aditi");
        aiml.put(6,"Shivam");
        aiml.put(7,"Varun");
        aiml.put(5,"Ganga");

        aiml.put(3,null);
        aiml.put(4,null);
        aiml.put(null,"Laxmi");

        System.out.println(aiml);

        System.out.println("Map element with for-each loop");
        System.out.println("Traversing via key");
        for(Integer k : aiml.keySet()) {
            System.out.println(k + " " + aiml.get(k));
        }

        System.out.println("Traversing via entry");
        for(Map.Entry<Integer, String> entry : aiml.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Iterator<Map.Entry<Integer, String>> itr = aiml.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key: " + entry.getKey() +", Value: " + entry.getValue() );
        }
    }
}
