/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 24-07-2020
 *   Time: 13:49
 *   File: PasswordEncryption.java
 */

package testingPrograms.encryptingPassword;

import java.util.Scanner;

public class PasswordEncryption {
    public static void main(String[] args) {
        // Taking password input from user using Scanner class.
        Scanner forInput = new Scanner(System.in);
        System.out.print("Please Enter your Password : ");
        String initialPassword = forInput.nextLine();
        forInput.close();
        // Converting the password into lowercase.
        initialPassword = initialPassword.toLowerCase();
        // Calculating length of the password for iterations.
        int lengthOfPassword = initialPassword.length();
        // Initialising encryptedPassword variable to store encrypted password in it.
        String encryptedPassword = "";
        // Iterating & encrypting the password given by user.
        for (int characterIteration = 0; characterIteration < lengthOfPassword; characterIteration++) {
            if ((int) initialPassword.charAt(characterIteration) <= 120 &&
                    (int) initialPassword.charAt(characterIteration) >= 97) {
                encryptedPassword += (char) ((int) initialPassword.charAt(characterIteration) + 2);
            } else if ((int) initialPassword.charAt(characterIteration) == 121) {
                encryptedPassword += (char) 97;
            } else if ((int) initialPassword.charAt(characterIteration) == 122) {
                encryptedPassword += (char) 98;
            } else {
                encryptedPassword += initialPassword.charAt(characterIteration);
            }
        }
        // Printing the encypted password.
        System.out.println("Encrypted Password = " + encryptedPassword);
    }
}