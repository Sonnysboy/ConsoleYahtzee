package yahtzee.rules.impl;
import yahtzee.YahtzeeHand;
import yahtzee.rules.YahtzeeScoreRule;

public class RuleYahtzeeYahtzee extends YahtzeeScoreRule {
  public RuleYahtzeeYahtzee() {
    super("yahtzee", "Yahtzee!!", 99,
     RuleYahtzeeFourOfAKind.class, RuleYahtzeeThreeOfAKind.class);
  }
  @Override
  public int getAddedScore(YahtzeeHand hand) {

    return hand.total() == hand.at(0).getRoll() * 5 ? 50 : 0;
  }

}