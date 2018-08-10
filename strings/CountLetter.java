/*
   Write a method that takes
   a string and character as 
   a parameter, and returns the 
   number of times
   a character occurs.
   
*/

public class CountLetter {
   public static void main(String[] args) {
      String phrase = "apples and bannanas";
      char c = ' ';
      countTimes(phrase, c);
   }
   
   // Takes string phrase and char as parameters
   // counts the occurences of a in this case
   // returns count and prints result
   public static int countTimes(String phrase, char c) {
       int count = 0;
       for (int i = 0; i < phrase.length(); i++) {
          if (phrase.charAt(i) == 'a') {
            count++;
          }
       }
       System.out.print(count);
       return count;
   }
}