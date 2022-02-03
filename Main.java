import yahtzee.*;
public class Main {

  
  // > (a + a + a + a + b) ^ b & a << b ^ (b & a << a & 1)
  // when a = 4
  //  b = 5
  // ((a + a + a + a + b) ^ b & a << b ^ (b & a << a & 1)) - (a * 4) == b is TRUE.
  public static void main(String[] args) {
    YahtzeeHand hand = new YahtzeeHand();
    System.out.println(YahtzeeFormatter.formatHand(hand));
  }

}