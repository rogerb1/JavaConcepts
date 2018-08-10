/*
  Using hours.txt file
  create the following 
  output
  
  Kim (ID#123) worked 31.4 hours (7.85 hours/day) 
  Brad (ID#456) worked 36.8 hours (7.36 hours/day) 
  Stef (ID#789) worked 39.5 hours (7.9 hours/day)

*/

import java.util.*;
import java.io.*;

public class Hours {
   public static void main(String[] args) 
      throws FileNotFoundException {
      Scanner input = new Scanner(new File("hours.txt"));
      
      while (input.hasNextLine()) {
         String line = input.nextLine();
         Scanner lineScan = new Scanner(line);
         int id = lineScan.nextInt();
         String name = lineScan.next();
         double sum = 0.0;
         int count = 0;
         while (lineScan.hasNextDouble()) {
            sum = sum + lineScan.nextDouble();
            count ++;
         }
         double average = sum / count;
         System.out.println(name + " (ID #" + id + ")" + " worked " +
                            sum + " hours" + " (" + average + " hours/day" + ")");
      }
   }
}