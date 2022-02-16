package org.justinstein.interviewproblems.searchinsertposition;

public class SearchInsertPosition {

  public int searchInsert(int[] nums, int target) {
    // return trivial(nums, target);
    return recursiveBinarySearch(nums, target, 0, nums.length - 1);
  }

  // private int trivial(int[] sortedArray, int key) {
  // for (int i = 0; i <= sortedArray.length; i++) {
  // if (sortedArray[i] > key) {
  // return i;
  // }
  // }
  //
  // return sortedArray.length;
  // }
  //

  // nums = [1,3,5,6], target = 2 Output: 1 
  private int recursiveBinarySearch(int[] sortedArray, int key, int l, int r) {
    if (r <= l) {
      if(key > sortedArray[l]) {
        return l+1;
      } else {
        return l;
      }
    }

    int mid = l + (r - l) / 2;
    if (sortedArray[mid] == key) {
      return mid;

    } else if (key < sortedArray[mid]) {
      return recursiveBinarySearch(sortedArray, key, l, mid - 1);

    } else {
      return recursiveBinarySearch(sortedArray, key, mid + 1, r);
    }

  }
}

