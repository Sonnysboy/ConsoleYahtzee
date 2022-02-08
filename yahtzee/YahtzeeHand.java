
package yahtzee;

import java.util.*;
import java.util.stream.*;


/**
 * Will hold a hand of the dice
 */
public class YahtzeeHand {

    // you can hold 5 at a time.
    private RolledYahtzeeDice[] hand = new RolledYahtzeeDice[5];

    public YahtzeeHand(RolledYahtzeeDice[] dice) {
        if (dice.length != 5)
            throw new RuntimeException("Dice hand too big or small");
        this.hand = dice;
    }

    public YahtzeeHand() {
        for (int i = 0; i < 5; i++) {
            hand[i] = RolledYahtzeeDice.getRandomDice();
        }
    }

    public void rerollDice(int ind) {
        System.out.println("DEBUG: rerolled dice to " + hand[ind].reroll());
    }

    /**
     * Use zero-indexes please.
     */
    public void rerollFrom(int start, int end) {
        for (; start < end; start++) {
            rerollDice(start);
        }
    }

    /**
     * Re-arranges the order of the dice so that they are in least -> most value.
     */
    public void sort() {

        Arrays.sort(hand);

    }

    public RolledYahtzeeDice[] getHand() {
        return this.hand;
    }

    public int[] asInts() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = at(i).getRoll();
        }
        return arr;
    }
    public int[] asInts(boolean sorted) {
        if (sorted)
            this.sort();
        return asInts();
    }

    public int total() {
        int sum = 0;
        for (int a : asInts()) sum += a;
        return sum;
    }

    public RolledYahtzeeDice at(int index) {
        return hand[index];
    }
    public String toString() {
      return String.format(
        "YahtzeeHand@%d{hand=%s}", this.hashCode(), Arrays.toString(this.hand)
      );
    }

}