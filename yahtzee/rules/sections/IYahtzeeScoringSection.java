package yahtzee.rules.sections;

import java.util.*;
import yahtzee.*;
import yahtzee.rules.*;


public interface IYahtzeeScoringSection {




  /**
  The printed display of this scoring section
  */
  String getDisplay();



  void addRule(SectionedYahtzeeScoreRule rule);


  

  /**
    
  */
}