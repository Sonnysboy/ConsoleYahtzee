package yahtzee.rules.sections.registrar;
import yahtzee.*;
import yahtzee.rules.*;
import yahtzee.rules.sections.*;
import java.util.concurrent.*;
import java.util.*;

// will hold all of the sections and their stuff.
public class SectionRegistrar {


  private static ConcurrentLinkedQueue<YahtzeeScoringSection> sections = new ConcurrentLinkedQueue<>();



  public static void register(YahtzeeScoringSection wat) {
    sections.offer(wat);
  }


  public static Optional<YahtzeeScoringSection> getByInternalId(String what) {
    return sections.stream().filter(e -> e.getInternalName().equals(what)).findAny();
  }


  public static YahtzeeScoringSection next() {
    return sections.poll();
  }


  static {
    
  }
  




}