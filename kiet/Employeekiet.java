package kiet;

public class Employeekiet {
    public String Emp_name;
    private int Salary;
    protected int Emp_id;
    String Organisation;

    void employeeDetails(){
        System.out.println("Details of kiet Employee are:" +"\n"+Emp_id+" "+Emp_name+" "+Salary+" "+Organisation);  
    }
    public static void main(String[] args) {
        Employeekiet ek=new Employeekiet();
        ek.Emp_name="Sudhakar";
        ek.Emp_id=120;

        ek.Salary=15000;
        ek.Organisation="KIET Group";


        ek.employeeDetails();
    
    }
}
