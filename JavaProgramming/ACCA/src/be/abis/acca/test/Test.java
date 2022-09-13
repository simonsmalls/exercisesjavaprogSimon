package be.abis.acca.test;
import  be.abis.acca.model.*;

public class Test {

    public static void main(String[] args) {

        Palindromes[] p ={ new Palindromes(),new PalindromePhrase()};
        String[] words ={"wow", "racecar","test","s"};

        PalindromePhrase p2= new PalindromePhrase();
        String t="Was it a car or a cat I saw?";
        System.out.println(p[0].isPalindrome(t));
        System.out.println(p[1].isPalindrome(t));



    }
}
