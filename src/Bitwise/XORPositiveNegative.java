
package Bitwise;

/**
* A =(-)10 = 000 1010
 *           111 0101----1s Compliment
 *                 +1
 * -------------------
 *           111 0110----2s Compliment
 *          1111 0110----add 1 on left most significant bit to make negative
 * B = +05 = 0000 0101
 *          
 *           
 * A ^ B = 1111 0110
 *         0000 0101
 * -----------------
 *         1111 0011(as we have negative left most bit has to complete further tasks)
 * 
 *          111 0011

 *          000 1100-----1s Compliment
 *                +1
 * -----------------
 *          000 1101----2s Compliment
 * 
 *                  13 so adding 1 at left 1000 1101 = -13
 * 
 * 
 * 
 */
public class XORPositiveNegative {
 public static void main(String[] args) {
          byte a = -10;
          byte b = +05;
          byte c = (byte)(a ^ b);

          System.out.println("a & b = " + c);
     }
}
