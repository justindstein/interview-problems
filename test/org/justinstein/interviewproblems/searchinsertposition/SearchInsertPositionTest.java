package org.justinstein.interviewproblems.searchinsertposition;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SearchInsertPositionTest {

  /*
   * https://leetcode.com/problems/search-insert-position/
   * 
   * Given a sorted array of distinct integers and a target value, return the index if the target is
   * found. If not, return the index where it would be if it were inserted in order.
   * 
   * You must write an algorithm with O(log n) runtime complexity.
   * 
   * 
   * 
   * Example 1:
   * Input: nums = [1,3,5,6], target = 5 Output: 2 
   * 
   * Example 2:
   * Input: nums = [1,3,5,6], target = 2 Output: 1 
   * 
   * Example 3:
   * Input: nums = [1,3,5,6], target = 7 Output: 4
   * 
   * 
   * Constraints:
   * 
   * 1 <= nums.length <= 104 -104 <= nums[i] <= 104 nums contains distinct values sorted in
   * ascending order. -104 <= target <= 104
   */

  private static SearchInsertPosition searchInsertPosition;


  @BeforeClass
  public static void buildUp() {
    searchInsertPosition = new SearchInsertPosition();
  }

  @Test
  public void example1() {
    int result = searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 5);
    Assert.assertEquals(2, result);
  }

  @Test
  public void example2() {
    int result = searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 2);
    Assert.assertEquals(1, result);
  }
  
  @Test
  public void example3() {
    int result = searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 7);
    Assert.assertEquals(4, result);
  }
  
  @Test
  public void example4() {
    int result = searchInsertPosition.searchInsert(new int[] {1, 3}, 0);
    Assert.assertEquals(0, result);
  }
  
}
