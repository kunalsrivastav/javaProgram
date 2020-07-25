/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 25-07-2020
 *   Time: 19:46
 *   File: LabTask3.java
 */

package lab.lab2;

// Task 3 - Create a program in Java to demonstrate declaration, initialization and usage of local variables.

public class LabTask3 {
    public static void main(String[] args) {
        // We cannot use whereToSpendThisVacation in this class because its scope is limited to only that class

        // Declaration and Initialization of Local Variable
        boolean tripToGoaThisVacation = false;

        // Usage
        System.out.println("We are Goint to Goa this Vacation : " + tripToGoaThisVacation);

        Vacation weAreGoingSomewhere = new Vacation();
        weAreGoingSomewhere.spentVacation();
    }
}

class Vacation {
    // We cannot use tripToGoaThisVacation in this class because its scope is limited to only that class

    // Declaration and Initialization of Local Variable
    String whereToSpendThisVacation = "Home Quarantine! It would be great choice.";

    void spentVacation() {
        System.out.println("Where are going to spent this Vacation : " + whereToSpendThisVacation);
    }
}