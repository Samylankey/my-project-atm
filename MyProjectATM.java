/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.project.atm;
import java.util.Scanner;
/**
 *
 * @author taiwo
 */
public class MyProjectATM {
    private static Scanner in;
    private static float balance = 75000; //initial balance to 0 for everyone
    private static int anotherTransaction;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        in  = new Scanner(System.in);
        // call our transaction method here
        transaction();
        
    }
    private static void transaction(){
        //here is most of work is
        int choice;
        System.out.println("***WELCOME TO GTBANK***");
        System.out.println("Please select your prefferd option");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");
        
         choice=in.nextInt();
         
         switch(choice){
             case 1:
                 float amount;
                 System.out.println("Please enter amount to Withraw: ");
                 amount = in.nextFloat();
                 if(amount > balance || amount == 75000){
                     System.out.println("You have insufficient funds\n\n");
                     anotherTransaction(); // to ask if they want another transaction
                 }
             case 2:
                 //option number 2 is depositing
                 float deposit;
                         System.out.println("Please enter your deposit amount");
                        deposit = in.nextFloat();
                        //update balance
                        balance = deposit + balance;
                        System.out.println("You have deposited "+deposit+"new balance is "+balance+"\n");
                        anotherTransaction();
                        break;
             case 3:
                 // this option is to check balance
                 System.out.println("Your balance is "+balance+"\n");
                 anotherTransaction();
                 break;
                 default:
                     System.out.println("Invalid option:\n\n");
                     anotherTransaction();
                     break;
                     
                 
                     
                 }
         }
        
        private static void anotherTransaction(){
            System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n2 To exit");
            anotherTransaction = in.nextInt();
            if (anotherTransaction == 1){
                transaction(); //call transaction method
            }else if(anotherTransaction ==2){
                System.out.println("Thank you for banking with us.Have a Lovely day");
            }else {
                System.out.println("Invalid code\n\n");
                anotherTransaction();
                        
                        }
            }
    }
    

