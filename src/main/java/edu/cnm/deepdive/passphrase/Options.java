package edu.cnm.deepdive.passphrase;


import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;

public class Options {

  public static void main(String[] args) {
    try {
      org.apache.commons.cli.Options options = buildOptions();
      CommandLineParser parser = new DefaultParser();
      org.apache.commons.cli.CommandLine cmdLine = parser.parse(options, args);
      if(cmdLine.hasOption("?")) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java " + Options.class.getName(),
            options);
      }
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  // defines my options
  private static org.apache.commons.cli.Options buildOptions() {
    //returns a builder      //this list of options can be in any order I want
    Option repeatOpt =          Option.builder("r").hasArg(false)
                                                  .longOpt("no-repeat")
                                                  .desc("excludes repeated characters or words")
                                                  .build();
    Option uppercaseOpt =       Option.builder("u").hasArg(false)
                                                  .longOpt("no-upper")
                                                  .desc("excludes uppercase letters")
                                                  .build();
    Option lowercaseOpt =       Option.builder("w").hasArg(false)
                                                  .longOpt("no-lower")
                                                  .desc("excludes lowercase")
                                                  .build();
    Option digitsOpt =         Option.builder("g").hasArg(false)
                                                  .longOpt("no-digits")
                                                  .desc("excludes digits(numbers)")
                                                  .build();
    Option ambiguousOpt =      Option.builder("a").hasArg(false)
                                                  .longOpt("no-ambiguous-characters")
                                                  .desc("exclude 0, O, o, L, l")
                                                  .build();
    Option chaosOpt =          Option.builder("g").hasArg(false)
                                                  .longOpt("allow-chaos")
                                                  .desc("excludes consecutive words or characters")
                                                  .build();
    Option symbolsOpt =        Option.builder("s").hasArg(false)
                                                  .longOpt("exclude-symbols")
                                                  .desc("exclude symbols")
                                                  .build();
    Option lengthOpt =         Option.builder("l").argName("value") // set its arg name
                                                  .optionalArg(true) // mark the builder object as an optional option
                                                  .hasArg(true)
                                                  .numberOfArgs(1)
                                                  .longOpt("length")
                                                  .desc("requested length of generated artifact")
                                                  .required()
                                                  .type(Number.class)
                                                  .build(); // returns an option
    Option delimiterOpt =      Option.builder("d").argName("value") // set its arg name
                                                  .optionalArg(true) // mark the builder object as an optional option
                                                  .hasArg(true)
                                                  .numberOfArgs(1)
                                                  .longOpt("delimiter")
                                                  .desc("space between words(*, -, _, |)")
                                                  .required()
                                                  .type(Number.class)
                                                  .build();
    Option helpOpt =           Option.builder("?").longOpt("help")
                                                  .required(false)
                                                  .hasArg(false)
                                                  .desc("Displays options and description")
                                                  .build();
    Option modeOpt =           Option.builder("x").hasArg(false)
                                                  .longOpt("password-mode")
                                                  .desc("password generator")
                                                  .build();

    org.apache.commons.cli.Options options = new org.apache.commons.cli.Options();
    options.addOption(repeatOpt);
    options.addOption(uppercaseOpt);
    options.addOption(lowercaseOpt);
    options.addOption(digitsOpt);
    options.addOption(symbolsOpt);
    options.addOption(lengthOpt);
    options.addOption(delimiterOpt);
    options.addOption(ambiguousOpt);
    options.addOption(chaosOpt);
    options.addOption(modeOpt);
    options.addOption(helpOpt);
    return options;
  }

}
