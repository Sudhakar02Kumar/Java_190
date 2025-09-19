import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
public class PropertiesFileExample {
    public static void main(String[] args) throws IOException{
        Properties props=new Properties();
        //Set Properties
        props.setProperty("db.user","Laxmi");
        props.setProperty("db.password","secret");

        //Save to a file
        FileOutputStream fos=new FileOutputStream("config.properties");
        props.store(fos,"Database Configuration");
        System.out.println("Info has been stored in file");
        fos.close();

        //Now load file
        Properties loadProps=new Properties();
        FileInputStream
    }
}