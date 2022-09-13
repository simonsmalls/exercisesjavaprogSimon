package be.abis.courseadmin.test;


import be.abis.courseadmin.model.*;
import be.abis.courseadmin.test.*;
import be.abis.courseadmin.util.StringUtils;

public class Test {

    public static void main(String[] args) {

        int x = 7 + 3 * 6 / 4 - 1;
        System.out.println(x);
        System.out.println("Small change from Jana");



        System.out.println(StringUtils.capit("test"));

        Course course = new Course("jave",5,50);

        Company c = new Company("abis");
        Company c2 = new Company("smalls");
        Gender gender=Gender.MALE;
        Person p1= new Person("Simon", "Hazevoets",c2,gender);

        PublicSessions test = new PublicSessions(course,c,p1,"7/8/2022");
        CompanySessions test2 = new CompanySessions(course,c, p1,"5/8/2022",c2);

        test2.setNumberParticipants(8);
        Sessions[] array= {test,test2};

        for (Sessions session:array){
            session.printInfo();
        }
        Consultancy s= new Consultancy();
        TopConsultancy t = new TopConsultancy();
        Service[] a= {test,test2,s};

        for (Service service:a){

            String y = "test";
            double o= service.calculatePrice();
            Class k=service.getClass();
            System.out.println(o+ k.getSimpleName() );
            if (service instanceof Sessions) {
                ((Sessions) service).printInfo();
            }



        }
        System.out.println(t.calculatePrice());




    }
}
