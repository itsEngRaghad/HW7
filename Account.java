public class Account {
    //initilization
    private String id,name;
    private double balance=0.0, creditAmount, debitAmount, aftercred,afterdeb;

    //constructures

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    //Setter & Getter


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public void setDebitAmount(double debitAmount) {
        if(debitAmount<=balance)
        {
            this.debitAmount = debitAmount;
        }
        else System.out.println("sorry no enough balance to debit");
    }

    public void setAftercred(double aftercred) {
        this.aftercred = aftercred;
    }

    public void setAfterdeb(double afterdeb) {
        this.afterdeb = afterdeb;
    }




    //-------

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public double getDebitAmount() {
        return debitAmount;
    }

    public double getAftercred() {
        return balance+creditAmount;
    }

    public double getAfterdeb() {
        return balance-debitAmount;
    }

    public void transfer(Account c, double transAmount)
    {
        if(this.balance<=transAmount){
            System.out.println("sorry ur trying to transfer money u don't have lol");
        }
        else {
            this.balance=balance-transAmount;
            c.balance=balance+transAmount;
            System.out.println("balance now for: "+this.name+" is: "+this.balance+" and balance now for : "+c.name+" is: "+c.balance);
        }
    }



    //to string


    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", creditAmount=" + creditAmount +
                ", debitAmount=" + debitAmount +
                ", aftercred=" + aftercred +
                ", afterdeb=" + afterdeb +
                '}';
    }
}
