package yahtzee.rules.impl;
import yahtzee.YahtzeeHand;
import yahtzee.rules.*;

public class RuleYahtzeeThreeOfAKind extends YahtzeeScoreRule {

  public RuleYahtzeeThreeOfAKind() {
    super("three_of_a_kind", "Three of a kind!");
  }


  public int getAddedScore(YahtzeeHand hand) {
    // if there are 3 of a kind,
    int[] rolls = hand.asInts();
    int same = 0;
    int sum = 0;
    for (int i = 0 ; i < rolls.length - 1; i++) {
      if (rolls[i] == rolls[i + 1]) ++same;
      sum += rolls[i];
    }
    return same == 3 ? sum : 0;
  }


}