package yahtzee.rules.sections;

import yahtzee.*;
import java.util.*;
import yahtzee.rules.*;

public abstract class YahtzeeScoringSection implements IYahtzeeScoringSection {

  private String displayName;
  private String internalName;
  private PriorityQueue<SectionedYahtzeeScoreRule> rules;

  /**
   * These are not changeable.
   */
  public YahtzeeScoringSection(String internalName, String displayName) {
    this.displayName = displayName;
    this.internalName = internalName;
    this.rules = new PriorityQueue<SectionedYahtzeeScoreRule>();
  }

  public PriorityQueue<SectionedYahtzeeScoreRule> getScoreRules() {
    return rules;
  }

  public String getDisplayString() {
    return displayName;
  }

  public String getInternalName() {
    return internalName;
  }
  /**
    To be called to run this section.
  */  
  public abstract void beginSection(YahtzeeHand hand);

  /**
   * Add a rule to this scoring section.
   */
  @Override
  public void addRule(SectionedYahtzeeScoreRule rule) {
    rules.offer(rule);
  }
  /**
  * returns and removes the next rule.
  */
  public SectionedYahtzeeScoreRule nextRule() {
    return rules.poll();
  }
  public String getDisplay() {
    return this.displayName;
  }
}