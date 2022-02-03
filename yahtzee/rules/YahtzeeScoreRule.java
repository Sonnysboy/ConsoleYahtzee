
package yahtzee.rules;

import yahtzee.*;
import java.util.*;

public abstract class YahtzeeScoreRule implements IYahtzeeScoreRule {

  /**
   * this can be used to identify it later on.
   */
  private String internalIdentification;

  /**
   * The beautified text, to be used inside score-card printing.
   */
  private String displayText;

  /**
   * The rule's priority.
   */
  private int priority;


/**
  Things that if this adds points, then these ones will not.
*/
  private Optional<Class<? extends YahtzeeScoreRule>[]> conflictions = Optional.empty();

  public YahtzeeScoreRule(String internalID, String displayText) {
    // lowest priority.
    this(internalID, displayText, 0);
  }
  public YahtzeeScoreRule(String internalID, String displayText, int priority) {
    this(internalID, displayText, priority, null);
    

  }

  public YahtzeeScoreRule(String internalID, String displayText, int priority, Class<? extends YahtzeeScoreRule>... conflictions) {
    this.internalIdentification = internalID;
    this.displayText = displayText;
    this.priority = priority;
    this.conflictions = Optional.ofNullable(conflictions);
    
  }
  /**
   * return 0 if nothing applies.
   */
  public abstract int getAddedScore(YahtzeeHand hand);

  public boolean doesApply(YahtzeeHand hand) {
    return getAddedScore(hand) != 0;
  }

  public String getDisplayText() {
    return this.displayText;
  }

  protected String getInternalID() {
    return this.internalIdentification;
  }
  public int getPriority() {
    return this.priority;
  }
  public boolean hasConflictions() {
    return this.conflictions.isPresent();
  }
  public Class<? extends YahtzeeScoreRule>[] getConflictions() {
    return conflictions.get();
  }
}