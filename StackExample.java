import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        //push
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);

        System.out.println("Stack Size: "+st.size());
        System.out.println("Stack capacity: "+st.capacity());
        //pop=delete
        System.out.println("Stack pop: "+st.pop());
        //peek=show
        System.out.println("Stack peep: "+st.peek());

    }
}
