public class Employee {
    // initalization
    private String id,name;
    private double salary, annual,afterRaised, raise;

    //constructures

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //Setter & Getter.

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAnnual(double annual) {
        this.annual = annual;
    }

    public void setAfterRaised(double afterRaised) {
        this.afterRaised = afterRaised;
    }

    public void setRaise(double raise) {
        this.raise = raise;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnual() {
        return salary*12;
    }

    public double getAfterRaised() {
        return salary*raise;
    }

    public double getRaise() {
        return (raise/salary)*100;
    }

    //to string


    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", annual=" + annual +
                ", afterRaised=" + afterRaised +
                ", raise=" + raise +
                '}';
    }
}
