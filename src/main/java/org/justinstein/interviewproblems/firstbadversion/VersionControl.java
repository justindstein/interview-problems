package org.justinstein.interviewproblems.firstbadversion;

public class VersionControl {

  private int firstBadVersion;

  public VersionControl(int firstBadVersion) {
    this.firstBadVersion = firstBadVersion;
  }

  public boolean isBadVersion(int version) {
    return (version >= this.firstBadVersion);
  }
}
