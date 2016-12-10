
package Bitwise;

/**
 * A =(-)10= 000 1010
 *           111 0101----1s Compliment
 *                  +1
 * -------------------
 *           111 0110----2s Compliment
 *          1111 0110----add 1 on left most significant bit to make negative
 * B = +05 = 0000 0101
 *          
 *           
 * A & B = 1111 0110
 *         0000 0101
 * -----------------
 *         0000 0100(as we have positive left most bit this is answer)
 * 
 * A | B = 1111 0110
 *         0000 0101
 * -----------------
 *         1111 0111(as we have negative left most bit has to complete further tasks)
 *          111 0111
 *          000 1000-----1s Compliment
 *                +1
 * -----------------
 *          000 1001----2s Compliment
 * 
 *                  9 so adding 1 at left 1000 1001 = -9
 * 
 * 
 * 
 * @author Hasan
 */
public class ANDPositiveNegative {

     public static void main(String[] args) {
          byte a = -10;
          byte b = +05;
          byte c = (byte)(a & b);

          System.out.println("a & b = " + c);
     }
}
