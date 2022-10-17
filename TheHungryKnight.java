package TheHungryKnight;

/* 
 * Kaleb Parham
 * Computer Science CS 232
 * Jacksonville State University
 * Ayers Hall
 * Professor: Christopher Ogden
 */
import java.util.Scanner;

public class TheHungryKnight {
  
public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    
    System.out.print("Welcome to the Red Baron’s Inn and Tavern, Sir. "
            + "We are honored to serve the King’s men during these trying days "
            + "as our Kingdom readies itself for War. Your warhorses shall be "
            + "looked after at our stable and your rooms prepared for you once "
            + "you have broken your fast with us for the night. Please free to "
            + "encourage your men to eat and drink as much as desired, Sir "
            + "Knight. The Crown will pay for your meal and lodging for you "
            + "and your horses, Sir. We merely need to keep our accounting "
            + "accurate for the Baron’s tax collector. ");
    
    System.out.print ("May I ask for your name for my records, Sir Knight?");
    String name = input.next();
    System.out.print ("And how are you called");
    String character = input.next ();
    System.out.print ("Sir" + name + "The" + character);
    
    System.out.print ("Please tell me what you would like to order: \n"
            + "Roast Pheasant = 15.15 silver pieces \n"
            + "Beef Stew = 3.79 silver pieces \n"
            + "Loaf of fine Bread = 5.37 silver pieces \n"
            + "Piece of fine Fruit = 1.29 silver pieces \n"); 
    
    System.out.print ("How many plates of Roast Pheasant will your party "
            + "require us to prepare");
    int Roast = input.nextInt();
    System.out.print ("How many bowls of Beef Stew will your party "
            + "require us to prepare");
    int Beef = input.nextInt();
    System.out.print ("How many Loafs of fine Bread will your party "
            + "require us to prepare");
    int Bread = input.nextInt();
    System.out.print ("How many pieces of fresh Fruit will your party "
            + "require us to prepare");
    int Fruit = input.nextInt();
    
    double subtotal = (Roast + Beef + Bread + Fruit);
    System.out.print ("The subtotal is " + subtotal + "\n");
    
    double tax = subtotal * 0.05;
    System.out.print ("The Baron’s 5% tax on your order is: " + tax + "\n");
    
    double total = subtotal + tax;
    System.out.print ("The final tally for the meal tonight is: " + total + 
            "silver");
    
    
}
}
