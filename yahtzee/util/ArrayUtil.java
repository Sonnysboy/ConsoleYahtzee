package yahtzee.util;
import java.util.*;
import yahtzee.*;

public class ArrayUtil {
  private static int SET_THREE = 0x01;
  private static int SET_TWO = 0x02;


public static boolean hasFullHouse(YahtzeeHand hand) {
    int[] nums = hand.asInts(true);
    return nums[0] == nums[1] && nums[2] == nums[3] && nums[2] == nums[4] || (nums[0] == nums[1] && nums[1] == nums[2] && nums[3] == nums[4]);
}

// returns the number of array elemnts that are within 1 number from eachother.
// 1-2-3-4-5
// etc...
  public static int sequentialCount(int[] nums) {
    Arrays.sort(nums);
    int count = 0;
    for (int i = nums.length - 1; i >= 1; i--) {
      if (nums[i] - nums[i - 1] == 1) {
        count++;
      }
    }
    return count;

  }
    /**
     *  @param what The array
     * @param amount how many of the same amount.
     */
    public static boolean nItemsSame(int[] what, int amount) {

        int count = 0;
        for (int i : what) {
            count++;
        }
        return count == amount;
    }
}
