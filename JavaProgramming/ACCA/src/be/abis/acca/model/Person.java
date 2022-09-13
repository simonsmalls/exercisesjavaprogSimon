package be.abis.acca.model;

public class Person {
    private int personNumber;
    private String firstName;
    private String lastName;
    private int age;
    private static int uniquePersons;
    private Company company;

    public Person( String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        uniquePersons++;
        personNumber=uniquePersons;
    }

    public String toString(){
        return firstName+" "+lastName;
    }

    public void printInfo(){
        if (company==null){
            System.out.println(firstName+lastName+"("+age+" years old) is not employed at the moment");
        }else{
            System.out.println(firstName+lastName+"("+age+" years old) works for "+ company.getName());
        }
    }
    public int calcualteAge(){
        return age;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public static int getUniquePersons() {
        return uniquePersons;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
