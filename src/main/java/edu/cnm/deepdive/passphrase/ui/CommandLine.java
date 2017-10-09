package edu.cnm.deepdive.passphrase.ui;

    import edu.cnm.deepdive.passphrase.util.Constants;
    import edu.cnm.deepdive.passphrase.Options;
    import java.util.HashMap;
    import java.util.Map;

//TODO - Write main method as a test rig for Options class.

public class CommandLine {

  public static void main(String[] args) {
    Options Options = new Options();
    Map<String,Object> map = new HashMap<>();

    for(Map.Entry<String, Object> entry: map.entrySet()){
      System.out.printf("%s = %s%n", entry.getKey(), entry.getValue());
    }
  }
}