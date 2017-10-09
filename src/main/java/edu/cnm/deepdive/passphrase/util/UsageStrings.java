package edu.cnm.deepdive.passphrase.util;

import java.util.ResourceBundle;


public class UsageStrings {
   private final ResourceBundle bundle;
  //Singleton has to
  private static class Singleton {
    private static final UsageStrings INSTANCE = new UsageStrings();
  }
  private UsageStrings() {
    bundle = ResourceBundle.getBundle(Constants.USAGE_BUNDLE);

  }
  public static ResourceBundle getBundle() {
    return Singleton.INSTANCE.bundle;

  }

}
