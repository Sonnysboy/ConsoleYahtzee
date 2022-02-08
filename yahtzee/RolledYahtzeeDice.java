
package yahtzee;
import java.util.*;
public class RolledYahtzeeDice implements Comparable<RolledYahtzeeDice> {

  private int roll;

  public RolledYahtzeeDice(int roll) {
    this.roll = roll;
  }

  public static RolledYahtzeeDice getRandomDice() {
    return new RolledYahtzeeDice(getRandomFaceValue());
  }
  /**
  @returns the old value.
  */
  public int reroll() {
    int old = this.roll;
    this.roll = getRandomFaceValue();
    return old;
  }
// move to utils.
  protected static int getRandomFaceValue() {
    return 1 + (int) (Math.random() * 5);
  }
  public int getRoll() {
    return roll;
  }
  public int compareTo(RolledYahtzeeDice other) {
    return getRoll() - other.getRoll();

  }


  @Override
  public String toString() {
    return String.format(
      "RolledYahtzeeDice@%d{value=%d}", this.hashCode(), getRoll()
    );
  }
}