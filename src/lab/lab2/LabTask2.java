/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 25-07-2020
 *   Time: 19:16
 *   File: LabTask2.java
 */

package lab.lab2;

// Task 2 - Create a program in Java to create local variables with the var keyword. Assign the value of all 8 primitive data types to 8 variables.

public class LabTask2 {
    public static void main(String[] args) {
        // Laptop
        var numberOfTypeCPort = (byte) 2;
        var numberOfUnitsSold = (short) 20000;
        var numberOfUnitsManufactured = 75000;
        var modelnumber = 1523495670L;
        var priceOfLaptop = 99_999.00f;
        var screenSizeInCM = 33.782D;
        var seriesOfLaptop = 'X';
        var canRunHighEndSoftwares = true;
        System.out.println("numberOfTypeCPort : " + numberOfTypeCPort);
        System.out.println("numberOfUnitsSold : " + numberOfUnitsSold);
        System.out.println("numberOfUnitsManufactured : " + numberOfUnitsManufactured);
        System.out.println("modelnumber : " + modelnumber);
        System.out.println("priceOfLaptop : " + priceOfLaptop);
        System.out.println("screenSizeInCM : " + screenSizeInCM);
        System.out.println("seriesOfLaptop : " + seriesOfLaptop);
        System.out.println("canRunHighEndSoftwares : " + canRunHighEndSoftwares);
    }
}