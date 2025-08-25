 class  Employee  {
    int id;
    String name;
    String org;

    void details(){
        System.out.println("Details are: "+id+" "+name+" "+org);
    }
    

    
}

class Faculty extends  Employee{
    String dept;
    String subject;

    void FacultyDetails(){
        System.out.println("Department is:  "+dept+" \nSubject is: "+subject);
    }

}



public class InheritanceSingle {
    public static void main(String[] args) {
        Faculty f1=new Faculty();
        f1.id=101;
        f1.name="Sudhakar";
        f1.subject="maths";
        f1.details();
    }
    
}
