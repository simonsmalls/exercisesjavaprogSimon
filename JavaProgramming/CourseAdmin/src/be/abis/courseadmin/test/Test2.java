package be.abis.courseadmin.test;
import javax.sound.midi.Soundbank;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome");


        while(true){
            System.out.println("Would you like to get welcomed again?");
            System.out.println("Y/N");
            String code = scan.nextLine();
            if (code.equals("Y")){
                System.out.println("Welcome");
            }else if (code.equals("N")) {
               break;

            }else{
                System.out.println("input is incorrect");
            }


        }



        }
    }


