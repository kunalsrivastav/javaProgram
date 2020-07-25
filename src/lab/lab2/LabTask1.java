/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 25-07-2020
 *   Time: 15:14
 *   File: LabTask1.java
 */

package lab.lab2;

// Task-1

public class LabTask1 {
    public static void main(String[] args) {
        System.out.printf("%-15s %-23s %-23s %-15s\n", "data type", "size in bits", "size in bytes", "range");
        System.out.printf("%-15s %-23d %-23d %-15s\n", "byte", Byte.SIZE, Byte.BYTES, "from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.printf("%-15s %-23d %-23d %-15s\n", "short", Short.SIZE, Short.BYTES, "from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.printf("%-15s %-23d %-23d %-15s\n", "int", Integer.SIZE, Integer.BYTES, "from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.printf("%-15s %-23d %-23d %-15s\n", "long", Long.SIZE, Long.BYTES, "from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.printf("%-15s %-23d %-23d %-15s\n", "float", Float.SIZE, Float.BYTES, "from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.printf("%-15s %-23d %-23d %-15s\n", "double", Double.SIZE, Double.BYTES, "from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.printf("%-15s %-23d %-23d %-15s\n", "char", Character.SIZE, Character.BYTES, "from " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        System.out.printf("%-15s %-23s %-23s %-15s\n", "boolean", "precisely not defined", "precisely not defined", "has " + Boolean.TRUE + " and " + Boolean.FALSE);
    }
}