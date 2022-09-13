import java.lang.reflect.Array;

public class Ex1 {



    public static void main(String[] args) {
        String firstName ="Bob";
        int age =43;
        double salary= 3216.54;
        boolean senior = false;
        String pronoun;
        String pos;
        String lv;


        Gender gender=Gender.MALE;

        System.out.println(gender.getAbbr()+"test");
        switch(gender){
            case MALE: pronoun="he"; pos="his"; lv="him"; break;
            case FEMALE: pronoun="she"; pos="her";lv="her"  ;break;
            case OTHER: pronoun="they";pos="their";lv="them"  ; break;
            default:pronoun="they";pos="";lv="";

        }



        System.out.println(firstName +" is "+age +" years old with an income of "+salary+" Senior:" +senior);
        double salaryYearly=salary*12;
        double net=0;



        String sen= (senior ? "":"not");
        System.out.println(pronoun+" is "+ sen + " a senior");
        age = 21;
        int worktime =-2;
        salary=0;
        int startAge= Integer.parseInt(args[0]);
        int nowAge= Integer.parseInt(args[1]);
        double startsal= Double.parseDouble(args[2]);


        for(age=startAge;age<nowAge;age+=2){


            worktime+=2;
            if (worktime<35) {
                salary *= 1.05;
            }
            if (salary==0){salary=startsal;}

            salaryYearly=salary*12;

            if (salaryYearly<13870){
                net = salary/100*75;
            } else if (salaryYearly<24480){
                net= salary/100*60;
            }else if (salaryYearly<42370){
                net = salary/100*55;
                String s= "test";
            }else{
                net = salary/100*50;


            }
            System.out.println(pos+" net salary at "+age+" is " +net);

        }
        String[] domains = {"dom1","dom2", "dom3","google"};
        int a;
        a= domains.length;
        for(String dom:domains){
            System.out.println(dom.length());
        }


        System.out.println(capit(pronoun)+ " has "+ pos+ " family. they like "+ lv );

    }
    static String capit(String str){

        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
