import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Account c1=new Account("1113486433","Raghad",1000.0);
        System.out.println("Hello "+c1.getName()+" ur ID is "+c1.getId()+" ur balance is: "+c1.getBalance());
        c1.setCreditAmount(20.0);
        System.out.println("your balance after crediting "+c1.getCreditAmount()+" is: "+ c1.getAftercred());
        c1.setDebitAmount(10.0);
        System.out.println("your balance after crediting "+c1.getDebitAmount()+" is : "+ c1.getAfterdeb());
        //--------------------------------------------------------
        Employee e1=new Employee("1113486433", "Raghad", 7000.0);
        System.out.println("Hello Employee "+e1.getName()+" ur ID is "+e1.getId()+" ur Salary is: "
                +e1.getSalary()+" ur annual Salary is: " + e1.getAnnual());

        e1.setRaise(100.0);
        System.out.println("your Salary after Raise by "+e1.getRaise()+"% is : "+ e1.getAfterRaised());
        //-------------------------------------------------------
        Account c2=new Account("2222","Majd",500.0);
        System.out.println("Balance before transfeering for Raghad is "+c1.getBalance()+" and for majd is: "+c2.getBalance());
        c2.transfer(c1,20);




    }


}
