package yahtzee.rules.impl;
import yahtzee.YahtzeeHand;
import yahtzee.rules.YahtzeeScoreRule;

public class RuleYahtzeeChance extends YahtzeeScoreRule {
  public RuleYahtzeeChance() {
    super("chance", "Chance", 0);
  }

  @Override
  public int getAddedScore(YahtzeeHand hand) {
    return hand.total();
  }

}