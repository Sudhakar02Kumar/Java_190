public class EmployeeStatic {
    int Emp_id;
    static String Org;

    void  details(){
        System.out.println("ID: "+Emp_id+" "+"Organisation is: "+Org);
    }

    public static void main(String[] args) {
        
        EmployeeStatic.Org = "KIET";
        EmployeeStatic es=new EmployeeStatic();
        es.Emp_id=101;

        es.details();

        EmployeeStatic es2=new EmployeeStatic();
        es2.Emp_id=102;
        es2.details();
    }
}
