package org.justinstein.interviewproblems.squaresofasortedarray;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class SquaresOfASortedArray {

  public int[] sortedSquares(int[] nums) {
    int[] squaredNums = getSquared(nums);
    int[] sortedNums = getSorted(squaredNums);
    return sortedNums;
  }

  private int[] simplestSolution(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] *= nums[i];
    }
    Arrays.sort(nums);
    return nums;
  }

  private int[] getSquared(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      result[i] = nums[i] * nums[i];
    }

    return result;
  }

  private int[] getSorted(int[] nums) {
    final Integer[] objectNums = ArrayUtils.toObject(nums);
    Arrays.sort(objectNums); // , Collections.reverseOrder());
    return ArrayUtils.toPrimitive(objectNums);
  }
}
