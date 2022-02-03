
package yahtzee;

import yahtzee.rules.*;
import java.util.*;

public class YahtzeeScoreCard {

  private YahtzeeHand hand;

  /**
   * this will hold what applies to the current hand.
   */
  private List<IYahtzeeScoreRule> applicableScoringRules = new ArrayList<>();

  private PriorityQueue<Class<? super IYahtzeeScoreRule>> scoreQueue = new PriorityQueue<>();

  private int score;

  public YahtzeeScoreCard(YahtzeeHand hand) {
    this.hand = hand;
    this.score = 0;
    recalcScore();
  }

  public int getScore() {
    return this.score;
  }

  private void recalcScore() {

  }

}