/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 27-07-2020
 *   Time: 11:10
 *   File: Lab3Task.java
 */

package lab.lab3;

import java.util.Scanner;

public class Lab3Task {

    public static final String DISCOUNT_CODE = "CoVid19";

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);
        String clientInputDiscountCode = scannerObject.nextLine();
        scannerObject.close();

        if (clientInputDiscountCode.isEmpty() || clientInputDiscountCode.isBlank()) {
            System.out.println("The coupon code cannot be blank or empty.");
        } else if (clientInputDiscountCode.toLowerCase().equals(DISCOUNT_CODE.toLowerCase())) {
            System.out.println("Congrats, you get ₹ 100 off on your bill!");
        } else {
            System.out.println("Discount code is not valid.");
        }

    }
}