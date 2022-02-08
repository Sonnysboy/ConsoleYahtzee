package yahtzee.rules.sections.impl.lower.rules;

import yahtzee.util.*;
import yahtzee.rules.*;
import yahtzee.rules.sections.SectionedYahtzeeScoreRule;
import java.util.*;
import yahtzee.rules.sections.impl.lower.YahtzeeSectionLower;
import yahtzee.*;


public class RuleYahtzeeStraightLarge extends SectionedYahtzeeScoreRule {

  public RuleYahtzeeStraightLarge() {
   super("large_straight", "Large Straight!", 6,YahtzeeSectionLower.class); 
  }
  public int getAddedScore(YahtzeeHand hand) {
    if (ArrayUtil.sequentialCount(hand.asInts()) == 5) {
      return 40;
    }
    return 0;
  }
  public List<Class<? extends IYahtzeeScoreRule>> getConflictions() {
    return Arrays.asList(RuleYahtzeeStraightSmall.class);
  }
}
