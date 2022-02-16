package org.justinstein.interviewproblems.binarysearch;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BinarySearchTest {

  /*
   * https://leetcode.com/problems/binary-search/ https://leetcode.com/submissions/detail/637539849/
   * 
   * Given an array of integers nums which is sorted in ascending order, and an integer target,
   * write a function to search target in nums. If target exists, then return its index. Otherwise,
   * return -1.
   * 
   * You must write an algorithm with O(log n) runtime complexity.
   * 
   * 
   * 
   * Example 1:
   * 
   * Input: nums = [-1,0,3,5,9,12], target = 9 Output: 4 Explanation: 9 exists in nums and its index
   * is 4 Example 2:
   * 
   * Input: nums = [-1,0,3,5,9,12], target = 2 Output: -1 Explanation: 2 does not exist in nums so
   * return -1
   * 
   * 
   * Constraints:
   * 
   * 1 <= nums.length <= 104 -104 < nums[i], target < 104 All the integers in nums are unique. nums
   * is sorted in ascending order.
   */

  private static BinarySearch binarySearch;

  @BeforeClass
  public static void buildUp() {
    binarySearch = new BinarySearch();
  }

  @Test
  public void example1() {
    int result = binarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, 9);
    Assert.assertEquals(4, result);
  }

  @Test
  public void example2() {
    int result = binarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, 2);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void example3() {
    int result = binarySearch.search(new int[] {2, 5}, 0);
    Assert.assertEquals(-1, result);
  }
}
