package yahtzee.rules.sections.impl.lower.rules;

import yahtzee.YahtzeeHand;
import yahtzee.rules.sections.*;
import yahtzee.rules.sections.impl.lower.YahtzeeSectionLower;

public class RuleYahtzeeYahtzee extends SectionedYahtzeeScoreRule {
  public RuleYahtzeeYahtzee() {
    super("yahtzee", "Yahtzee!!", 99, YahtzeeSectionLower.class);
  }

  @Override
  public int getAddedScore(YahtzeeHand hand) {

    return hand.total() == hand.at(0).getRoll() * 5 ? 50 : 0;
  }

}