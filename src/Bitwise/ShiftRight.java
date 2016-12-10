package Bitwise;

/**
 * 0 0 1 1 1 1 0 0 +60 
 * 0 0 1 1 1 Shifting right 3 bits
 * 0 0 0 0 0 1 1 1 Fill 
 * empty bits with sign bit B = A>>3 
 * 0 0 0 0 0 1 1 1
 *
 * @author Hasan
 */
public class ShiftRight {

     public static void main(String[] args) {
          byte a = 60;
          byte b = (byte) (a >> 3);

          System.out.println("a>>3 " + b);

          /**
           * For A:
               +10 = 0001010
               1110101 1’s Complement
                    +1
               1110110 2’s Complement
               -10 = 11110110
             For B:
               11111101
                1111101 (Magnitude)
                0000010 1’s Complement
                     +1
               0000011 2’s Complement
                000011 = 3
               ( B = -3)
           */
          byte c = -10;
          byte d = (byte) (c >> 2);

          System.out.println("a>>2 " + d);
     }
}
