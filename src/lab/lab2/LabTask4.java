/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 25-07-2020
 *   Time: 19:55
 *   File: LabTask4.java
 */

package lab.lab2;

// Task 4 - Create a program in Java to demonstrate declaration, initialization and usage of static and non-static variables.

public class LabTask4 {
    public static void main(String[] args) {
        Smartphone victim = new Smartphone();
        victim.showContactNumber();
        victim.showNumberOfSIMCards();
        victim.showSmartphoneSeries();
    }
}

class Smartphone {
    // Declaration and Initialization of static variables.
    static long contactNumber1 = 99360032;
    static long contactNumber2 = 99360033;

    // Declaration and Initialization of non-static variables.
    char smartphoneSeries = 'V';
    int numberOfSIMCards = 2;

    // We can make this method both static and non-static
    static void showContactNumber() {
        System.out.println("Contact Number 1 : " + contactNumber1);
        System.out.println("Contact Number 2 : " + contactNumber2);
    }

    // We cannot make this method as a static method because it contains field which is non-static
    void showSmartphoneSeries() {
        System.out.println("Smartphone Series : " + smartphoneSeries);
    }

    // We cannot make this method as a static method because it contains field which is non-static
    void showNumberOfSIMCards() {
        System.out.println("Number of SIM Cards : " + numberOfSIMCards);
    }
}