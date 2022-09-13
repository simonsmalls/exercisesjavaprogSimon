package be.abis.acca.model;

public class Course {

    private String title;
    private int days;
    private int price;
    private boolean priorKnowledgeNeeded;

    public Course(String title, int days, int price) {
        this.title = title;
        this.days = days;
        this.price = price;
    }

    public boolean isPriorKnowledgeNeeded() {
        return priorKnowledgeNeeded;
    }

    public void setPriorKnowledgeNeeded(boolean priorKnowledgeNeeded) {
        this.priorKnowledgeNeeded = priorKnowledgeNeeded;
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

    public double calculateTotalPrice(){
        if(days<3 && !priorKnowledgeNeeded){
            double a=days*price*1.21;
            labelPrice(a);
            return a;
        }else{
        double a= days*price;
            labelPrice(a);

        return days*price;}
    }
    private void labelPrice(double price){
        if (price<500){
            System.out.println("cheap");
        }else if (price> 1500){
            System.out.println("expensive");
        }else{
            System.out.println("ok");
        }

    }

    public String toString(){
        return title;
    }
}
