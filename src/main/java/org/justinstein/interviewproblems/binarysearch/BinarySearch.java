package org.justinstein.interviewproblems.binarysearch;

public class BinarySearch {

  public int search(int[] nums, int target) {
    return recursiveBinarySearch(nums, target, 0, nums.length - 1);
  }

  // https://www.baeldung.com/java-binary-search
  public int recursiveBinarySearch(int[] sortedArray, int key, int low, int high) {
    int middle = low + ((high - low) / 2);

    if (high < low) {
      return -1;
    }

    if (key == sortedArray[middle]) {
      return middle;

    } else if (key < sortedArray[middle]) {
      return recursiveBinarySearch(sortedArray, key, low, middle - 1);

    } else {
      return recursiveBinarySearch(sortedArray, key, middle + 1, high);
    }
  }
}


