/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginsystem;

/**
 *
 * @author Student
 */  
import java.util.Scanner;

public class LoginSystem{

    static Scanner sc = new Scanner(System.in);

    public static boolean validateUser(String uName) {
        // Must have an underscore and be under 6 chars
        return uName.contains("_") && uName.length() <= 5;
    }

    public static boolean checkPass(String pword) {
        return pword.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    }

    public static boolean isPhoneValid(String cell) {
        return cell.matches("^\\+27\\d{9}$");
    }

    public static boolean doRegistration(String uName, String pword) {
        if (!validateUser(uName)) {
            System.out.println("Error: Username needs an '_' and can't be longer than 5 characters.");
            return false;
        }
        
        if (!checkPass(pword)) {
            System.out.println("Error: Password needs 8+ chars, a number, and a capital letter.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String currentUser = "";
        String currentPass = "";

        // User Registration phase
        while (true) {
            System.out.print("Enter a username: ");
            String user = sc.nextLine();

            System.out.print("Enter a password: ");
            String pass = sc.nextLine();

            if (doRegistration(user, pass)) {
                System.out.println("Success! You are registered.");
                currentUser = user;
                currentPass = pass;
                break;
            }
            System.out.println("Please try again.\n");
        }

        // Phone number entry
        while (true) {
            System.out.print("Enter your phone number (start with +27): ");
            String phoneNum = sc.nextLine();

            if (isPhoneValid(phoneNum)) {
                System.out.println("Phone saved.");
                break;
            }
            System.out.println("That phone number is invalid.");
        }

        System.out.println("\n--- Login Page ---");

        // Login loop
        while (true) {
            System.out.print("Username: ");
            String loginUName = sc.nextLine();

            System.out.print("Password: ");
            String loginPword = sc.nextLine();

            // Checking credentials
            if (loginUName.equals(currentUser) && loginPword.equals(currentPass)) {
                System.out.println("Welcome back!");
                break;
            } else {
                System.out.println("Incorrect credentials, try again.");
            }
        }
    }
}