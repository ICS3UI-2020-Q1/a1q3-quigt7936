import java.util.Scanner;
/**
 *
 * @ThomasQuigley 
 */
public class Main {

  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask how many of each item
    System.out.println("How many chromebook chargers?");
    int chargers = input.nextInt();
    System.out.println("How many motherboards?");
    int motherboards = input.nextInt();
    System.out.println("How many mice?");
    int mice = input.nextInt();
    // calculate the subtotal, taxes and total
    double subTotal = chargers * 34.99 + motherboards * 127.50 + mice * 18.00;
    double taxes = subTotal * 0.13;
    double total = subTotal + taxes;
    // tell them their subtotal, taxes and total
    System.out.println("Subtotal = $" + subTotal);
    System.out.println("Taxes = $" + taxes);
    System.out.println("Total = $" + total);

    
  }
}
