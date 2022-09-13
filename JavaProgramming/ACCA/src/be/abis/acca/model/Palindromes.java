package be.abis.acca.model;

public class Palindromes {

   public boolean isPalindrome(String word){
      boolean a=true;
      for (int i=0; i<word.length();i++){
         if (word.charAt(i)==word.charAt(word.length()-1-i)){

         }else{
            a=false;
         }
      }
      if (word.length()==1){a=false;}
      return   a;
   }

   public int countNumberOfPalindromes(String[] words){
      int count=0;
      for (String word:words){

         if(isPalindrome(word)){
            System.out.println(word);
            count++;
         }
      }
      return   count;
   }
}
