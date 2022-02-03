package yahtzee;
import java.util.*;

public class YahtzeeFormatter {

  /**
   * "+-----+", "| |" "| o |" "| |" "+-----+" +-----+ +-----+ +-----+ +-----+
   * +-----+
   */

  /**
   * 0 = roll of 1, 1 = 2, etc..
   */
  private static String[] formatsByIndex = { "+-----+\n|     |\n|  o  |\n|     |\n+-----+",
      "+-----+\n| o   |\n|     |\n|   o |\n+-----+", "+-----+\n| o   |\n|  o  |\n|   o |\n+-----+",
      "+-----+\n| o o |\n|     |\n| o o |\n+-----+", "+-----+\n| o o |\n|  o  |\n| o o |\n+-----+",
      "+-----+\n| o o |\n| o o |\n| o o |\n+-----+", };

  public static String getDiceString(int roll) {
    return formatsByIndex[roll - 1];
  }

  public static String getDiceString(RolledYahtzeeDice roll) {
    return getDiceString(roll.getRoll());
  }

  public static String formatHand(YahtzeeHand hand) {
    StringBuilder s = new StringBuilder();
    hand.sort();
    // todo make the things all go onto one line.

    String[] strings = new String[5];
    for (int i = 0; i < 5; i++) {
      RolledYahtzeeDice die = hand.at(i);
      strings[i] = getDiceString(die);
    }
    // combine them all into one printable message.
    // this is a very very inefficient algorithm.
    for (int i = 0; i < strings.length; i++) {
      for (int j = 0; j < 5; j++) {
        s.append(strings[j].split("\n")[i]);
      }
      s.append("\n");
    }
    return s.toString();
  }

}