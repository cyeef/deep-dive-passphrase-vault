package edu.cnm.deepdive.passphrase;

import java.util.Random;

public abstract class RandomArtifactGenerator {

  private int length;
  private boolean repeatedAllowed;
  private Random rng;

  protected RandomArtifactGenerator() {
  }

  public abstract String generate();

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public boolean isRepeatedAllowed() {
    return this.repeatedAllowed;
  }

  public void setRepeatedAllowed(boolean repeatedAllowed) {
    this.repeatedAllowed = repeatedAllowed;
  }

  public Random getRng() {
    return rng;
  }

  public void setRng(Random rng) {
    this.rng = rng;
  }

}
