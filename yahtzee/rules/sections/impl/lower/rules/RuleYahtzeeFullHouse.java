package yahtzee.rules.sections.impl.lower.rules;
import java.util.*;

import yahtzee.*;
import yahtzee.rules.*;
import yahtzee.rules.sections.SectionedYahtzeeScoreRule;
import yahtzee.rules.sections.impl.lower.YahtzeeSectionLower;
import yahtzee.util.ArrayUtil;;
public class RuleYahtzeeFullHouse extends SectionedYahtzeeScoreRule {


  
  public RuleYahtzeeFullHouse() {
    super("full_house", "Full House!", 10,
    YahtzeeSectionLower.class);
  }
  public int getAddedScore(YahtzeeHand hand) {

    
    return ArrayUtil.hasFullHouse(hand) ? 25 : 0;
  }
  public List<Class<? extends IYahtzeeScoreRule>> getConflictions() {
    return Arrays.asList(RuleYahtzeeThreeOfAKind.class, RuleYahtzeeFourOfAKind.class);
  }
}