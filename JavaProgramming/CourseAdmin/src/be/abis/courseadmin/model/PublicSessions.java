package be.abis.courseadmin.model;

public class PublicSessions extends Sessions{
    private Company abis= new Company("abis");

    public PublicSessions(Course course, Company location, Person instructor, String date) {
        super(course, location, instructor, date);
        super.setOrganizer(abis);
    }

    @Override
    public double calculatePrice() {
        return 100;
    }
    public Company getOrganizer(){
        return super.organizer;
    }
}
