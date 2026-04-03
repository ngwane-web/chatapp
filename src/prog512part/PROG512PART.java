/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog512part;

/**
 *
 * @author Student
 */
public class PROG512PART1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
public class PROG5121PART1 {
    
}
// Check username (must contain "_" and be <= 5 characters)
    public static boolean checkUsername(String username) {
        if (username.length() <= 5 && username.contains("_")) {
            return true;
        } else {
            return false;
        }
    }

    // Check password complexity
    public static boolean checkPasswordComplexity(String password) {
        // At least 8 characters, 1 uppercase, 1 number, 1 special character
        if (password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=<>?]).{8,}$")) {
            return true;
        } else {
            return false;
        }
    }

    // Check cellphone number (must start with +27 and be correct length)
    public static boolean checkCellphoneNumber(String cellphone) {
        if (cellphone.matches("^\\+27\\d{9}$")) {
            return true;
        } else {
            return false;
        }
    }

    // Register user
    public static boolean registerUser(String username, String password, String cellphone) {

        if (checkUsername(username) && 
            checkPasswordComplexity(password) && 
            checkCellphoneNumber(cellphone)) {

            return true;
        } else {
            return false;
        }
    }

    // Login user (simple version)
    public static boolean loginUser(String enteredUsername, String enteredPassword,
                                    String storedUsername, String storedPassword) {

        if (enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword)) {
            return true;
        } else {
            return false;
        }
    }

    // Return login message
    public static String returnLoginStatus(boolean loginStatus) {
        if (loginStatus) {
            return "Login successful!";
        } else {
            return "Login failed!";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // === REGISTRATION ===
        System.out.println("Enter username:");
        String username = sc.nextLine();

        System.out.println("Enter password:");
        String password = sc.nextLine();

        System.out.println("Enter cellphone (+27...):");
        String cellphone = sc.nextLine();

        boolean registered = registerUser(username, password, cellphone);

        if (registered) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed. Please check your details.");
            return; // stop program if failed
        }

        // === LOGIN ===
        System.out.println("\nLogin now");

        System.out.println("Enter username:");
        String loginUsername = sc.nextLine();

        System.out.println("Enter password:");
        String loginPassword = sc.nextLine();

        boolean loginStatus = loginUser(loginUsername, loginPassword, username, password);

        System.out.println(returnLoginStatus(loginStatus));
    }
}
    
}
