package be.abis.courseadmin.model;

public class Person {

    private String firstName;
    private String lastName;
    private Company company;
    private String[] hobbies=new String[10];
    private static int uniquepersons;
    private int numberPerson;
    public Gender gender;

    private int hobbycounter =0;

    public static int getUniquepersons() {
        return uniquepersons;
    }

    public Person(String firstName, String lastName, Gender gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        uniquepersons++;
        numberPerson=uniquepersons;

    }
    public  Person(String firstName, String lastName, Company company, Gender gender){
        this(firstName,lastName,gender);
        this.company=company;
    }
    public  Person(String firstName, String lastName, Company company, String[] hobbies,Gender gender){
        this(firstName,lastName, company,gender);
        addhobbies(hobbies);
    }

    public int getNumberPerson() {
        return numberPerson;
    }
    /** will this be added */
    public int getHobbycounter() {
        return hobbycounter;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String[] getHobbies() {
        return hobbies;
    }
    public void addHobby(String hobby){
        hobbies[hobbycounter]=hobby;
        hobbycounter++;

    }
    public void addhobbies(String[] hobbies){
        for (int i=0;i<hobbies.length;i++){
            addHobby(hobbies[i]);

        }
    }



    public void printInfo(){
        if(company==null){
            System.out.println(firstName+lastName+" doesn't work ");
        }else{
            System.out.println(firstName+lastName+" works for "+ company.getName());
        }
    }

    public void attendCourse(Course c){
        System.out.println(firstName+" is doing a "+ c.getTitle()+" course.");
    }

    public String toString(){
        return firstName +" " + lastName;
    }


}
