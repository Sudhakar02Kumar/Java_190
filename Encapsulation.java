import java.util.Scanner;
public class Encapsulation {
    private int Account_balance;
    private int upi_pin = 99999;

public void set_balance(int balance)
{
    Scanner scn = new Scanner(System.in);
    System.out.println("Plz enter upi pin : ");
    int pin = scn.nextInt();

    if(pin == upi_pin)
    {
        Account_balance = balance;
        System.out.println("Congratulations and celebrations");
    }
    else
    {
        System.out.println("Salary not credited");
    }

}

public int getBalance(){
    Scanner sc=new Scanner(System.in);
    System.out.println("To know the balace please enter UPI pin");
    int pin = sc.nextInt();
    if(pin==upi_pin){
        System.out.println("Available Balance is: "+Account_balance);
    }
}

}