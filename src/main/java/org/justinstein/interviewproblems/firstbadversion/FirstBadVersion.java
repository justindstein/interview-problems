package org.justinstein.interviewproblems.firstbadversion;

public class FirstBadVersion extends VersionControl {

  public FirstBadVersion(int firstBadVersion) {
    super(firstBadVersion);
  }

  /*
   * The isBadVersion API is defined in the parent class VersionControl. boolean isBadVersion(int
   * version);
   */

  public int firstBadVersion(int n) {
    // return trivial(n);
    return recursiveBinarySearchFirstMatch(0, n);

  }

  private int trivial(int n) {
    for (int i = 0; i <= n; i++) {
      if (isBadVersion(i)) {
        return i;
      }
    }
    return -1;
  }

  private int recursiveBinarySearchFirstMatch(int l, int r) {
    if (l == r) {
      return l;
    }

    int mid = l + (r - l) / 2;

    if (isBadVersion(mid)) {
      r = mid;

    } else {
      l = mid + 1;
    }
    
    return recursiveBinarySearchFirstMatch(l, r);

  }

}
