abstract class collegee {
    abstract void Register();
    abstract void Infrastructure();
    abstract void Students();
    abstract void Staff();
    void medicalFacility(){
        System.out.println("Medical Facilities are optional");
    }
}

 class KIETT extends collegee{
    void Register(){
        System.out.println("Kiet is resitered with AKTU");
    }
    void Infrastructure(){
        System.out.println("Kiet has digital classroom and labs");
    }
    void Students(){
        System.out.println("Addmissions through conselling");
    }
    void Staff(){
        System.out.println("Kiet staff is average");
    }
    void medicalFacility(){
        System.out.println("Kiet has basic medical facilities");
    }

 }
    

public class AbstractExample {
    public static void main(String[] args) {
        collegee cg;
        cg=new KIETT();
        cg.Register();
        cg.Infrastructure();
        cg.Students();
        cg.Staff();
        cg.medicalFacility();
    }
}
