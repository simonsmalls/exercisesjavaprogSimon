package be.abis.courseadmin.model;

public abstract class Sessions extends Service {

    private Course course;
    public Company organizer;
    private Company location;
    private Person instructor;
    private String date;

    public Sessions() {
    }

    public Sessions(Course course, Company location, Person instructor, String date) {
        this.course = course;
        this.location = location;
        this.instructor = instructor;
        this.date = date;
    }

    public void printInfo(){
        System.out.println("the "+ course.getTitle()+" course will start on "+ getDate()+". It will take place at "+ getLocation().getName() +". Your instructor is " + getInstructor().getFirstName()+getInstructor().getLastName() +" of "+ getInstructor().getCompany().getName() );
    }
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public abstract Company getOrganizer() ;

    public void setOrganizer(Company organizer) {
        this.organizer = organizer;
    }

    public Company getLocation() {
        return location;
    }

    public void setLocation(Company location) {
        this.location = location;
    }

    public Person getInstructor() {
        return instructor;
    }

    public void setInstructor(Person instructor) {
        this.instructor = instructor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
