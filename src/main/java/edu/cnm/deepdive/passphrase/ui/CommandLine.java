









package edu.cnm.deepdive.passphrase.ui;
import edu.cnm.deepdive.passphrase.Options;
import edu.cnm.deepdive.passphrase.RandomArtifactGenerator;
import edu.cnm.deepdive.passphrase.RandomPassphraseGenerator;
import edu.cnm.deepdive.passphrase.RandomPasswordGenerator;
import edu.cnm.deepdive.passphrase.util.Constants;
import edu.cnm.deepdive.passphrase.util.UsageStrings;
import java.security.SecureRandom;
import java.util.Map;
import java.util.ResourceBundle;

//TODO - Write main method as a test rig for Options class.

public class CommandLine {

  public static void main(String[] args) {

    try {
      Options options = new Options(args);
      Map<String, Object> map = options.map;

      for (Map.Entry<String, Object> entry : map.entrySet()) {
        System.out.printf("%s = %s%n", entry.getKey(), entry.getValue());
      }
      boolean passwordMode = map.containsKey(Constants.PASSWORD_MODE_OPTION);
      RandomArtifactGenerator generator;
      if (passwordMode) {
        generator = new RandomPassphraseGenerator();
        for (String key : map.keySet()) {
          switch (key) {
            // TODO - invoke setters on password generator
            case Constants.EXCLUDES_REPEAT:
              System.out.println("User specified no repeat characters.");
              break;
            case Constants.EXCLUDES_UPPERCASE:
              System.out.println("User specified no uppercase.");
              break;
            case Constants.EXCLUDES_LOWERCASE:
              System.out.println("User specified no lowercase.");
              break;
            case Constants.EXCLUDES_DIGITS:
              System.out.println("User specified no digits.");
              break;
            case Constants.EXCLUDES_AMBIGUOUS:
              System.out.println("User specified no ambiguous characters.");
              break;
            case Constants.EXCLUDES_ORDER:
              System.out.println("User specified no order characters.");
              break;
            case Constants.EXCLUDES_SYMBOLS:
              System.out.println("User specified no symbols.");
              break;
            case Constants.SPECIFY_LENGTH:
              System.out.println("User specified length.");
              break;

            case Constants.HELP_OPTION:
              System.out.println("User specified help.");
              break;
          }

        }
      } else {
        //passphrase mode
        generator = new RandomPassphraseGenerator();
        for (String key : map.keySet()) {
          switch (key) {
            // TODO - invoke setters on password generator
            case Constants.NO_REPEAT_OPTION:
              generator.setRepeatedAllowed(false);
              break;
            case Constants.EXCLUDES_ORDER:
              System.out.println("User specified no order words.");
              break;
            case Constants.LENGTH_OPTION:
              generator.setLength(((Number) map.get(Constants.LENGTH_OPTION)).intValue());
              break;
            case Constants.DELIMITER_OPTION:
              ((RandomPassphraseGenerator) generator).setDelimiter(((String) map.get(Constants.DELIMITER_OPTION)).charAt(0));
              break;
          }
        }
      }
      generator.setRng(new SecureRandom());
      System.out.println(generator.generate());
    } catch (Exception ex) {
      System.exit(-1);
    }


  }
}





























//package edu.cnm.deepdive.passphrase.ui;
//
//import edu.cnm.deepdive.passphrase.Options.HelpRequestedException;
//import edu.cnm.deepdive.passphrase.Options;
//import java.util.Map;
//import org.apache.commons.cli.ParseException;
//
//TODO - Write main method as a test rig for Options class.

//public class CommandLine {
//
//  public static void main(String[] args) throws ParseException, HelpRequestedException {
//    Options options = new Options(args);
//    Map<String,Object> map = options.getMap();
//
//    for(Map.Entry<String, Object> entry: map.entrySet()){
//      System.out.printf("%s = %s%n", entry.getKey(), entry.getValue());
//    }
//  }
//}