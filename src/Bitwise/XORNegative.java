
package Bitwise;
/**
* A = +10 = 000 1010
 *           111 0101----1s Compliment
 *                  +1
 * -------------------
 *           111 0110----2s Compliment
 *          1111 0110----add 1 on left most significant bit to make negative
 * B = +05 = 000 0101
 *           111 1010----1s compliment
 *                 +1
 * ------------------
 *           111 1011----2s Compliment
 *          1111 1011----add 1 on left most significant bit to make negative
 *           
 * A ^ B = 1111 0110
 *         1111 1011
 * -----------------
 *         0000 1101 = 13
 *
 * @author Hasan
 */
public class XORNegative {
public static void main(String[] args) {
          byte a = -10;
          byte b = -05;
          byte c = (byte)(a ^ b);

          System.out.println("a ^ b = " + c);
     }
}
