 public class EmployeeFinal {
   
    
    String Org ="KIET";
     void detailsOfEmp(){
        System.out.println(Org);
    }


    public static void main(String[] args) {
        EmployeeFinal ef=new EmployeeFinal();
        ef.Org="ABES";
        ef.detailsOfEmp();

    }

    // class Faculty extends EmployeeFinal{

    //     void detailsOfEmp(){
    //         System.out.println("Welcome to  overriding");
    //     }
         
    //     public static void main(String[] args) {
    //         Faculty f= new Faculty();
    //         f.detailsOfEmp();
    //     }

    // }
}
