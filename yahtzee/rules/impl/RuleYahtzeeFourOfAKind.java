package yahtzee.rules.impl;
import yahtzee.YahtzeeHand;
import java.util.*;
import yahtzee.rules.YahtzeeScoreRule;

public class RuleYahtzeeFourOfAKind extends YahtzeeScoreRule{


public RuleYahtzeeFourOfAKind() {
  super("four_of_a_kind", "Four of a kind", 2, RuleYahtzeeThreeOfAKind.class);
}
@Override
public int getAddedScore(YahtzeeHand hand) {
  int[] sorted = hand.asInts();
  Arrays.sort(sorted);
  
  return Arrays.stream(sorted).distinct().count() == 1 ? hand.total() : 0;
}



}