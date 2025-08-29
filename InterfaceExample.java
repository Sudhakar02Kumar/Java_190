
interface  Institute {
     void Register();
     void Infrastructure();
     void Students();
     void Staff();
    
     static void staticoncrete(){
        System.out.println("Static concrete method inside interface");

     } 
     default void defconcrete(){
        privateconcrete();
        System.out.println("Default concrete method inside interface");
     }
     private void privateconcrete(){
        System.out.println("Private concrete method inside interface");
        
     }
}

 class ABES implements Institute{
    public void Register(){
        System.out.println("Kiet is resitered with AKTU");
    }
    public void Infrastructure(){
        System.out.println("Kiet has digital classroom and labs");
    }
    public void Students(){
        System.out.println("Addmissions through conselling");
    }
    public void Staff(){
        System.out.println("Kiet staff is average");
    }
    
 }



public class InterfaceExample {
    public static void main(String[] args) {
        Institute ii;
        ii = new ABES();
        ii.Infrastructure();
        ii.Students();
        ii.Staff();

        Institute.staticoncrete();
        ii.defconcrete();
        
    }
}
