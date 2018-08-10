// CREATE A PROGRAM

// John bought three shirts at the local
// store. One shirt cost 38 dollars. The second one
// Cost 40 dollars. The last one cost 15 dollars.
// Write a program that outputs the subtotal, tax included,
// and gran total. We will assume that the tax for everything
// purchased was 8%.


// Calculates the cost of three shirts
// and prints out the subtotal, tax included, and grand total.
public class Receipt {
   public static void main(String[] args) {
      int subtotal = 38 + 40 + 15; // int ariable storing subtotal
      double tax = subtotal * .08; // double variable storing tax
      double granTotal = subtotal + tax;
      System.out.println("Subtotal: $" + subtotal);
      System.out.println("Tax: $" + tax);
      System.out.println("Gran Total: $" + granTotal);
   }
}
