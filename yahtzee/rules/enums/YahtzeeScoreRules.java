package yahtzee.rules.enums;

import yahtzee.rules.*;
import java.util.*;

// holds all the rules and their priorities.
// The higher the priority, the sooner they will be checked at scoring.
enum YahtzeeScoreRules {

 ; 

  private YahtzeeScoreRule rule;
  /**
   * If a rule has conflictions, it means that if this rule applies, then all the
   * rules given in this list will not be applicable.
   */

  private YahtzeeScoreRules(YahtzeeScoreRule rule) {
    this.rule = rule;
  }


  public YahtzeeScoreRule getRule() {
    return rule;
  }

}