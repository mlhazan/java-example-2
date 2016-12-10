
package Bitwise;
/**
 * A = +12 = 00001100
 * B = +05 = 00000101
 * ------------------
 *           00001001 = 9
 * @author Hasan
 */
public class XOR {
 public static void main(String[] args) {
          byte a = +12;
          byte b = +05;
          byte c = (byte)(a ^ b);

          System.out.println("a & b = " + c);
     }
}
