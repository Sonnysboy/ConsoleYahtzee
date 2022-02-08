package yahtzee.rules.sections.impl.lower.rules;

import yahtzee.YahtzeeHand;
import java.util.*;

import yahtzee.rules.IYahtzeeScoreRule;
import yahtzee.rules.YahtzeeScoreRule;
import yahtzee.rules.sections.impl.lower.YahtzeeSectionLower;
import java.util.*;
import yahtzee.rules.sections.SectionedYahtzeeScoreRule;;

public class RuleYahtzeeFourOfAKind extends SectionedYahtzeeScoreRule {

  public RuleYahtzeeFourOfAKind() {
    super("four_of_a_kind", "Four of a kind", 2, YahtzeeSectionLower.class);
  }

  @Override
  public int getAddedScore(YahtzeeHand hand) {
    int[] sorted = hand.asInts();
    Arrays.sort(sorted);

    return Arrays.stream(sorted).distinct().count() == 1 ? hand.total() : 0;
  }

  public List<Class<? extends IYahtzeeScoreRule>> getConflictions() {
    return Arrays.asList(RuleYahtzeeThreeOfAKind.class);
  }

}