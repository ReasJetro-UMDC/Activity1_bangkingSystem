/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<Integer> deposits = new ArrayList<>();
        int balance = 0;
         while (true) {
            System.out.println("Menuasdasxfa:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. View current balance");
            System.out.println("4. View deposits in ascending order");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    deposits.add(depositAmount);
                    balance += depositAmount;
                    System.out.println("Deposit successful!");
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                     case 3:
                    System.out.println("Current balance: $" + balance);
                    break;

                case 4:
                    if (deposits.isEmpty()) {
                        System.out.println("No Deposits .");
                    } else {
                        Collections.sort(deposits);
                        System.out.println("Deposits in ascending order: " + deposits);
                    }
                    break;

                case 5:
                    System.out.println("Exiting the banking system. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
         }
    }
    
}
