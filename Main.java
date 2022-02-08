import yahtzee.*;
import yahtzee.util.*;
public class Main {

  
  // > (a + a + a + a + b) ^ b & a << b ^ (b & a << a & 1)
  // when a = 4
  //  b = 5
  // ((a + a + a + a + b) ^ b & a << b ^ (b & a << a & 1)) - (a * 4) == b is TRUE.
  public static void main(String[] args) {
    YahtzeeHand hand = new YahtzeeHand();
    System.out.println(hand.toString());

    int a = 4;
    int b = 6;
    // ( a + a + a + a  + b) ^ b & a << b ^ (b & a << a & 1) - (4 * a) == b;
    // a << b
  }

}