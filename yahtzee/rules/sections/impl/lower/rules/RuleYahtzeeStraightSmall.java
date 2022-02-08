package yahtzee.rules.sections.impl.lower.rules;
import yahtzee.rules.sections.impl.lower.YahtzeeSectionLower;
import yahtzee.util.*;
import yahtzee.*;
import java.util.*;
import yahtzee.rules.*;
import yahtzee.rules.sections.SectionedYahtzeeScoreRule;


public class RuleYahtzeeStraightSmall extends SectionedYahtzeeScoreRule {

  public RuleYahtzeeStraightSmall() {
   super("small_straight", "Small Straight!", 5, YahtzeeSectionLower.class);
  }
  public int getAddedScore(YahtzeeHand hand) {

    return ArrayUtil.sequentialCount(hand.asInts()) == 4 ? 30 : 0;
  }
  public List<Class<? extends IYahtzeeScoreRule>> getConflictions() {
    return Arrays.asList(RuleYahtzeeStraightLarge.class);
  }
}
