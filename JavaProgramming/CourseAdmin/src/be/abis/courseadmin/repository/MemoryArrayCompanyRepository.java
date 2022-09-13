package be.abis.courseadmin.repository;

import be.abis.courseadmin.model.Company;

public class MemoryArrayCompanyRepository implements CompanyRepository {

    public Company[] companies;
    public Company c1= new Company("abis");
    public Company c2= new Company("smalls");
    public Company c3= new Company("google");
    public Company c4= new Company("meta");
    public Company c5= new Company("amazon");

    public MemoryArrayCompanyRepository() {
        this.companies =new Company[] {c1,c2,c3,c4,c5};
    }

    @Override
    public Company findCompany(int id) {
        for (Company c:companies){
            if (c.getCompanyNumber()==id){
                return c;
            }
        }
        return null;
    }

    @Override
    public Company findCompany(String name) {
        for (Company c:companies){
            if (c.getName() ==name){
                return c;
            }
        }
        return null;
    }

    @Override
    public void addCompany(Company c) {

    }

    @Override
    public void updateCompany(Company c) {


    }

    @Override
    public void deleteCompany(int id) {
        for (Company c:companies){
            if (c.getCompanyNumber()==id){
                c=null;
            }
        }

    }
}
