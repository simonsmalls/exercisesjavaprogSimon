package be.abis.courseadmin.model;

public class CompanySessions extends Sessions {

    private int numberParticipants;

    public CompanySessions(Course course, Company location, Person instructor, String date, Company company) {
        super(course, location, instructor, date);
        super.setOrganizer(company);
    }

    public CompanySessions(Course course, Company location, Person instructor, String date, Company company, int numberParticipants) {
        this(course, location, instructor, date,company);
        this.numberParticipants=numberParticipants;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("this session is offered by "+ this.getOrganizer().getName()+ (numberParticipants!=0? (this.getOrganizer().getName() +". there will be "+ numberParticipants): "") );
    }

    public double calculatePrice() {
        return 500;
    }

    public Company getOrganizer(){
        return super.organizer;
    }
    public int getNumberParticipants() {
        return numberParticipants;
    }

    public void setNumberParticipants(int numberParticipants) {
        this.numberParticipants = numberParticipants;
    }
}
