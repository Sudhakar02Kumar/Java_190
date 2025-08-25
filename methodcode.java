public class methodcode {
    int id;
    String name;

    methodcode(){
       // id=111;
       // name="Sudhakar";
      // System.out.println("Hello from Method construction");
    }

    methodcode(int id, String name){
        
    }
    
    public  void displayMethod(){
        System.out.println("Hello from display methhod");
        System.out.println("Details are: " +id+" "+name);
    }

    public static void main(String[] args) {
        methodcode n1=new methodcode();
        n1.id=101;
        n1.name="Sudhakar";
        n1.displayMethod();       

        methodcode n3 = new methodcode( 111, "Paraname");
        n3.displayMethod();
    }

}
