package be.abis.courseadmin.model;

public class Company {
    private String name;
    private int companyNumber;
    private static int uniqueCompany;

    public Company(String name) {
        this.name = name;
        uniqueCompany++;
        companyNumber=uniqueCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printInfo(){
        System.out.println(name);
    }
    public String toString(){
        return name;
    }

    public int getCompanyNumber() {
        return companyNumber;
    }

    public static int getUniqueCompany() {
        return uniqueCompany;
    }
}
