package be.abis.courseadmin.model;

public class Course {

    private String title;
    private int days;
    private int price;

    public Course(String title, int days, int price) {
        this.title = title;
        this.days = days;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println(title+" cost "+price+" per day for "+days+" days");
    }

    private int calculateTotalPrice(){
        return days*price;
    }
    public double calculateTotalPrice(double discount){

        return (1-discount)*calculateTotalPrice();

    }
    public String toString(){
        return title;
    }

}
