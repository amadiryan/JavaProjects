//Program to compute Library fineRate
/* Ryan Amadi:
 * J77-10529-2024:
 * Description: Java Program to compute Library fineRate
 */
import java.util.Scanner;
public class Libraryfines{
    public static void main(String[] args){
    //Create a scanner object//
            //Prompt user to enter bookID, dueDate and returnDate //
            Scanner scanner = new Scanner(System.in);
            double fineRate= 0;
            //Prompt user to enter bookID, dueDate and returnDate //
                System.out.println("Enter the bookID:");
                int bookIDnumber = scanner.nextInt();
                System.out.println("Enter the dueDate:");
                int dueDate = scanner.nextInt();
                System.out.println("Enter the returnDate:");
                int returnDate= scanner.nextInt();
                int daysLate = returnDate - dueDate;
                if(daysLate == 7){
                    fineRate = 20;
                }
                else if(daysLate > 7 && daysLate <= 14){
                    fineRate = 50;
                }
                else if(daysLate >= 15){
                    fineRate = 100;
                }
                //Calculate the fineAmount//
                double fineAmount = (daysLate * fineRate);
                //Display bookID, dueDate, returnDate, daysOverdue, fineRate, fineAmount//
                System.out.println("The bookID number is:" + bookIDnumber );
                System.out.println("The dueDate is:" + dueDate);
                System.out.println("The returnDate is:" + returnDate);
                System.out.println("The daysOverdue is :" + daysLate);
                System.out.println("The fine rate is:" + fineRate);
                System.out.println("The fine amount is:" + fineAmount);
            }
        }