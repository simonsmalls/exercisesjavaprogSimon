package be.abis.acca.model;

public class AbisEmployee extends Person implements Instructor, Sales, Manager{

    private double salary;
    private Address address;
    private static Company abis=new Company("abis");

    public AbisEmployee(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("earns "+ salary+ " and lives "+ address.getStreet() +" "+ address.getNr()+" in "+  address.getTown());
    }
    public double netIncome(){
        double salaryYearly=salary*12;
        double net=0;

        if (salaryYearly<13870){
             net = salary/100*75;
        } else if (salaryYearly<24480){
             net= salary/100*60;
        }else if (salaryYearly<42370){
             net = salary/100*55;

        }else{
             net = salary/100*50;


        }
        return net;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public void instruct() {
        System.out.println("instructing");
    }

    @Override
    public void manage() {
        System.out.println("managing");
    }

    @Override
    public void sell() {
        System.out.println("selling");
    }
}
