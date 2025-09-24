//Program to compute discount
/* Ryan Aduo Amadi:
 * J77-10529-2024:
 * Description: Java Program to compute discount
 */
import java.util.Scanner;
public class Discount {
    public static void main(String[] args){
        //Create a scanner object//
                Scanner scanner = new Scanner(System.in);
            double discount;
            //Prompt user to enter amount//
            System.out.println("Enter the amount:");
            double amount = scanner.nextDouble();
            if(amount >= 5000){
                discount = 0.1 * amount;
            }
            else if(amount > 1000 && amount <= 5000){
                discount = 0.05 * amount;
            }
            else{
                discount = 0;
            }
            //Calculate the Final Price//
            double finalPrice = amount - discount;
            //Display the Amount, discount and final price//
            System.out.println("The amount is:" + amount);
            System.out.println("The discount is:" + discount);
            System.out.println("The final price is:" + finalPrice);
        }
    }