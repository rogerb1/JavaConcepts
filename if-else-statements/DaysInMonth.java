/*
   Exercise one: If/Else

   Write a method that takes
   takes an int month as a
   parameter and returns the 
   number of days in that month. We
   will asume that this will not 
   be ran during a leap year
   
   1 Jan 2 Feb 3 March  4 Apr 5 May  6 Jun  7 Jul 8 Aug 9 Sep
    31    28    31       30    31     30      31   31    30 
   
   10 oct  11 Nov  12 Dec
     31      30      31

*/

public class DaysInMonth {
   public static void main(String[] args) {
      int month = 2;
      System.out.print(getDays(month));
   }
   
   // Takes integer month as a parameter
   // returns days in a month
   public static int getDays(int month) {
      if (month == 4 || month == 6 || month == 9 || month == 11) {
        return 30;
      } else if (month == 2) {
         return 28;
      } else {
        return 31;
      }
   }
}