package edu.cnm.deepdive.passphrase;

import com.sun.corba.se.impl.orbutil.closure.Constant;
import edu.cnm.deepdive.passphrase.util.Constants;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
// TODO Add logic for excluding some (not all symbols)

public class RandomPasswordGenerator extends RandomArtifactGenerator {

  private boolean orderExcluded = Constants.DEFAULT_ORDER_CONFIGURATION;
  private boolean uppercaseExcluded = Constants.DEFAULT_EXCLUDES_UPPERCASE;
  private boolean lowercaseExcluded = Constants.DEFAULT_EXCLUDES_LOWERCASE;
  private boolean digitsExcluded = Constants.DEFAULT_EXCLUDES_DIGITS;
  private boolean symbolsExcluded = Constants.DEFAULT_EXCLUDES_SYMBOLS;
  private boolean ambigiousExcluded = Constants.DEFAULT_EXCLUDES_AMBIGUOUS;

  //TODO - add StringBuilder.setCharAt
  //TODO - make setters for all private constants
  //TODO - set all default values for the fields
  //TODO - add setters to constructor

  public RandomPasswordGenerator() {
    setLength(Constants.DEFAULT_PASSWORD_LENGTH);
  }

  public String generate() {

    StringBuilder pool = new StringBuilder();
    String ambiguousRegex;
    if (ambigiousExcluded) {

      ambiguousRegex = "[" + new String(Constants.AMBIGUOUS) + "]";
    } else {
      ambiguousRegex = "(?!a)a";

    }

    if (!uppercaseExcluded) {
      pool.append(Constants.UPPERCASE.replaceAll(ambiguousRegex, " "));

    }
    if (!lowercaseExcluded) {
      pool.append(Constants.LOWERCASE.replaceAll(ambiguousRegex, " "));

    }
    if (!digitsExcluded) {
      pool.append(Constants.DIGITS.replaceAll(ambiguousRegex, " "));

    }
    if (!symbolsExcluded) {
      pool.append(Constants.SYMBOLS.replaceAll(ambiguousRegex, ""));
    }
    String source = pool.toString();
    List<Character> characters = new LinkedList<>();

    while (characters.size() < getLength()) {
      String character = WordList.getRandom(getRng());
      char c = source.charAt(getRng().nextInt(source.length()));
      if (isRepeatedAllowed() || !characters.contains(c)) {
        if (!orderExcluded)
          characters.add(c);
      } else {

        boolean searchAscending = true;
        boolean searchDescending = true;
        for (int i = 1; i <= Constants.MAX_ORDER_LENGTH; i++) {
          if (searchAscending && characters.get(characters.size() - i) == (char) (c - i)) {
            searchDescending = false;
          } else if (searchDescending && characters.get(characters.size() - i) == (char) (c + i)) {
            searchAscending = false;
          } else {
            characters.add(c);
            break;
          }
        }

        //if (characters.get(characters.size() - i) == (char) (c - 1)
        //  || characters.get(characters.size() - i) == (char) (c + 1)
      }
    }

     StringBuilder password = new StringBuilder();
    for (char c : characters) {
      password.append(c);
    }
    return password.toString();

    //return characters.stream().collect(Collectors.joining(Character.toString(delimiter)));
  }

  public boolean isOrderExcluded() {
    return orderExcluded;
  }

  public void setOrderExcluded(boolean orderExcluded) {
    this.orderExcluded = orderExcluded;
  }

  public boolean isUppercaseExcluded() {
    return uppercaseExcluded;
  }

  public void setUppercaseExcluded(boolean uppercaseExcluded) {
    this.uppercaseExcluded = uppercaseExcluded;
  }

  public boolean isLowercaseExcluded() {
    return lowercaseExcluded;
  }

  public void setLowercaseExcluded(boolean lowercaseExcluded) {
    this.lowercaseExcluded = lowercaseExcluded;
  }

  public boolean isDigitsExcluded() {
    return digitsExcluded;
  }

  public void setDigitsExcluded(boolean digitsExcluded) {
    this.digitsExcluded = digitsExcluded;
  }

  public boolean isSymbolsExcluded() {
    return symbolsExcluded;
  }

  public void setSymbolsExcluded(boolean symbolsExcluded) {
    this.symbolsExcluded = symbolsExcluded;
  }

  public boolean isAmbigiousExcluded() {
    return ambigiousExcluded;
  }

  public void setAmbigiousExcluded(boolean ambigiousExcluded) {
    this.ambigiousExcluded = ambigiousExcluded;
  }

}

