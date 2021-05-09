/*
 * Project: Vending Machine
 * Date: 2/23/21 (Redid it in 5/9/21)
 * Description: Vending Machine which takes user inputs
*/
import java.util.Scanner;

public class vendingMachine
{
    public static void main(String[] args)
    {
    	// Variables
    	Double A1,C7,A2,B4,B5,G8,A9;// Vending codes
    	A1 = C7 = 1.50; //$1 for code
    	A2 = B4 = B5 = G8 = 2.00; //2$ Amount for code
    	A9 = 3.00; 	// 3$ for code
    	
    	// Prints
        System.out.println("Welcome to the best snack machine of your life! This machine only accepts $1 bills. Please insert money.");
        System.out.println("Vending Codes:\n[A1] Snickers - $1.50, [A2] Chips - $2.00,  [B4] Gatorade - $2.00,  [C7] Reese's - $1.50, [A9] Trail Mix - $3.00, \n [B5] Hershey's - $2.00, [G8] Granola Bar - $2.00\nHow many $1 bills would you like to enter?");
       
        Scanner input = new Scanner(System.in);
        Double amount = input.nextDouble();
        int amountInt = (int)Math.round(amount); 
        System.out.println("You have put in " + amountInt + " dollar bills\nPlease enter your selected snack code number (Ex. A1,A2,B1,...).");
       
        Scanner input2 = new Scanner(System.in);
        String snack = input2.nextLine();
       
        System.out.println("You have selected " + snack + ". One moment please.");
        System.out.println("Are you happy with your selection? If not cancel now by entering 'no'. If you are happy enter 'yes'.");
      
        String decision = input2.nextLine();
        if(decision.equalsIgnoreCase("no")) {
            Double amountLeft = 0.0;
            System.out.println("We're sorry you are not happy with your choice. Here is a full refund.");
            System.out.format("Amount Left: $%.2f", amountLeft);
            System.out.format("\nAmount Returned: $%.2f", amount);
            System.out.println("Would you like to order a different snack?  If so, please enter \"yes\".");
            Scanner input3 = new Scanner(System.in);
            String reOrder = input3.nextLine();
             if (reOrder.equalsIgnoreCase("yes")) {
            	 System.out.println("Welcome to the best snack machine of your life! This machine only accepts $1 bills. Please insert money.");
                 System.out.println("[A1] Snickers - $1.50, [A2] Chips - $2.00,  [B4] Gatorade - $2.00,  [C7] Reese's - $1.50, [A9] Trail Mix - $3.00, \n [B5] Hershey's - $2.00, [G8] Granola Bar - $2.00");
                 System.out.println("How many $1 bills would you like to enter?");
                
                 Scanner input4 = new Scanner(System.in);
                 Double amount1 = input4.nextDouble();
                 int amountInt1 = (int)Math.round(amount1); 
                 
                 System.out.println("You have put in " + amountInt1 + " dollar bills\nPlease enter your selected snack code number (Ex. A1,A2,B1,...).");
                
                 Scanner input5 = new Scanner(System.in);
                 String snack1 = input5.nextLine();
                
                 System.out.println("You have selected " + snack + ". One moment please.");
             }
        } else if (decision.equalsIgnoreCase("yes")) {
            Double amountLeft = 0.0;
            String snackName = "";
            // Switch
            switch (snack.toLowerCase()) {
                case "a1": // if its A1 then
                    System.out.println("Getting [A1] Snickers");
                    amountLeft = amount - A1;
                    snackName = "Snickers";
                    break;
                case "a2":
                    System.out.println("Getting [A2] Chips");
                    amountLeft = amount - A2;
                    snackName = "Chips";
                    break;
                case "b4":
                    System.out.println("Getting [B4] Gatorade");
                    amountLeft = amount - B4;
                    snackName = "Gatorade";
                    break;
                case "c7":
                    System.out.println("Getting [C7] Reese's");
                    amountLeft = amount - C7;
                    snackName = "Reese's";
                    break;
                case "a9":
                    System.out.println("Getting [A9] Trail Mix");
                    amountLeft = amount - A9;
                    snackName = "Trail Mix";
                    break;
                case "b5":
                    System.out.println("Getting [B5] Hershey's");
                    snackName = "Hershey's";
                    amountLeft = amount - B5;
                    break;
                case "g8":
                    System.out.println("Getting [G8] Granola Bar");
                    snackName = "Granola Bar";
                    amountLeft = amount - G8;
                    break;
                default: // if none match then print this
                    System.out.println("That option does not exist!");
                    break;
            }
            // Calculating Amount Left
            System.out.format("Amount Left: $%.2f", amountLeft);
            System.out.println("\nReturning change...");
            System.out.format("\nAmount Returned: $%.2f", amountLeft);
            System.out.println("\n You chose "+ snackName +"! What a great choice! That is one of my favorites, I hope you enjoy it too! \nHope to see you again real soon!");
        }
        else {
            System.out.println("Invalid feedback. Cancelling Transaction.");
            System.out.format("\nAmount Returned: $%.2f", amount);
        }
        
    }
}