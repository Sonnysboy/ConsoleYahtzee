package yahtzee.rules.sections;

import yahtzee.rules.*;
import yahtzee.*;
import java.util.*;

public abstract class SectionedYahtzeeScoreRule implements IYahtzeeScoreRule { 

  private String displayName;
  private int priority;
  private String internalID;
  private final Class<? extends IYahtzeeScoringSection> scoringSection;

  public SectionedYahtzeeScoreRule(String internalID, String displayName, int priority,
      Class<? extends IYahtzeeScoringSection> section) {
    this.internalID = internalID;
    this.displayName = displayName;
    this.priority = priority;
    this.scoringSection = section;
  }

  public SectionedYahtzeeScoreRule(String internalID, String displayName, Class<? extends IYahtzeeScoringSection> section) {
    this(internalID, displayName, 0, section);
  }

  public SectionedYahtzeeScoreRule(String internalID, Class<? extends IYahtzeeScoringSection> owningSection) {
    this(internalID, internalID, owningSection);
  }

  /**
   * The added score for this hand.
   */
  @Override
  public abstract int getAddedScore(YahtzeeHand hand);



  public List<Class<? extends IYahtzeeScoreRule>> getConflictions() {return null;};
  public int getPriority() {
    return priority;
  }

  public String getDisplayName() {
    return displayName;
  }

  public String getInternalID() {
    return internalID;
  }

  public Class<? extends IYahtzeeScoringSection> getSection() {
    return scoringSection;
  }



  

}