package yahtzee.rules.sections.impl.lower.rules;
import yahtzee.YahtzeeHand;
import yahtzee.rules.sections.SectionedYahtzeeScoreRule;
import yahtzee.rules.sections.impl.lower.YahtzeeSectionLower;
import yahtzee.rules.YahtzeeScoreRule;

public class RuleYahtzeeChance extends SectionedYahtzeeScoreRule {
  public RuleYahtzeeChance() {
    super("chance", "Chance", 0, YahtzeeSectionLower.class);
  }

  @Override
  public int getAddedScore(YahtzeeHand hand) {
    return hand.total();
  }

}