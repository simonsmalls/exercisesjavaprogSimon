package be.abis.acca.model;

public class PalindromePhrase extends Palindromes{

    public boolean isPalindrome(String phrase){
        boolean a=true;
        String s=phrase.replace(" ","").replace("'","").replace("?","").toUpperCase();
        a=super.isPalindrome(s);


        return a;
    }
}
