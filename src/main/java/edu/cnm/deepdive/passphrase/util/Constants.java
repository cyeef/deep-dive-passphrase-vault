package edu.cnm.deepdive.passphrase.util;

//keys for accessing resource bundle properties, resources

public class Constants {

  //Resource bundle name
  public static final String USAGE_BUNDLE = "usage-strings";
  public static final String WORDS_BUNDLE = "diceware-words";


  // Definitions of the Exclusion string variables
  public static final String EXCLUDES_REPEAT = "repeatExcluded";
  public static final String EXCLUDES_UPPERCASE = "uppercaseExcluded";
  public static final String EXCLUDES_LOWERCASE = "lowercaseExcluded";
  public static final String EXCLUDES_DIGITS = "digitsExcluded";
  public static final String EXCLUDES_SYMBOLS = "symbolsExcluded";
  public static final String EXCLUDES_AMBIGUOUS = "ambigiousExcluded";
  public static final String EXCLUDES_ORDER = "orderExcluded";


  // Definitions of the Specifications string variables
  public static final String SPECIFY_LENGTH = "specifyLength";
  public static final String SPECIFY_DELIMITER = "specifyDelimiter";
  public static final int MINIMUM_PASSWORD_LENGTH = 5;
  public static final int MAXIMUM_PASSWORD_LENGTH = 20;
  public static final int MINIMUM_PASSPHRASE_LENGTH = 7;
  public static final int MAXIMUM_PASSPHRASE_LENGTH = 12;
  public static final char[] DELIMITER_SELECTION = {'_','-','*'};

  // Definition of the mode switch string
  public static final String MODE_SWITCH = "modeSwitch";


  // Definition of the Help Message string
  public static final String HELP_MSG = "helpMsg";


  // Definitions of the Error Messages
  public static final String MODE_SELECT_ERROR = "modeSelectError";
  public static final String LENGTH_ERROR = "lengthError";
  public static final String ARGUMENT_ERROR = "argumentError";
  public static final String DELIMITER_ERROR = "delimiterErrorMessage";


  // Definitions of the Warning Messages
  public static final String LENGTH_WARNING = "lengthWarning";
  public static final String MODE_WARNING = "modeWarning";
  public static final String UNRECOGNIZED_OPTION = "unrecognizedOption";
  public static final String MISSING_OPTION = "missingOption";


  // Definitions of the arguments
  public static final String EXCLUDES_SYMBOLS_ARGS = "excludesSymbolsArgs";
  public static final String SPECIFY_LENGTH_ARGS = "specifyLengthArgs";
  public static final String SPECIFY_DELEMITER_ARGS = "specifyDelimiterArgs";


  // long option names
  public static final String NO_REPEAT_OPTION = "no-repeat";
  public static final String NO_UPPER_OPTION = "no-upper";
  public static final String NO_LOWER_OPTION = "no-lower";
  public static final String NO_DIGITS_OPTION = "no-digits";
  public static final String NO_AMBIGUOUS_CHARACTERS_OPTION = "no-ambiguous-characters";
  public static final String EXCLUDES_ORDER_OPTION = "exclude-order";
  public static final String EXCLUDES_SYMBOLS_OPTION = "exclude-symbols";
  public static final String LENGTH_OPTION = "length";
  public static final String DELIMITER_OPTION = "delimiter";
  public static final String HELP_OPTION = "help";
  public static final String PASSWORD_MODE_OPTION = "password-mode";

  // Default values
  public static final boolean DEFAULT_REPEAT_ALLOWED = true;
  public static final char DEFAULT_DELIMITER = ' ';
  public static final int DEFAULT_PASSPHRASE_LENGTH = 6;
  public static final int DEFAULT_PASSWORD_LENGTH = 12;
  public static final boolean DEFAULT_ORDER_CONFIGURATION = false;
  public static final boolean DEFAULT_EXCLUDES_UPPERCASE = false;
  public static final boolean DEFAULT_EXCLUDES_LOWERCASE = false;
  public static final boolean DEFAULT_EXCLUDES_DIGITS = false;
  public static final boolean DEFAULT_EXCLUDES_SYMBOLS = false;
  public static final boolean DEFAULT_EXCLUDES_AMBIGUOUS = false;


  // Character list
  public static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static final String LOWERCASE = UPPERCASE.toLowerCase();
  public static final String DIGITS = "0123456789";
  public static final String SYMBOLS = "*!<>?/@#$%^&()-+_,.\\|{}[]~`:;\'\"";
  public static final char[] AMBIGUOUS = {'l','1', '0', 'o'};

  public static final int MAX_ORDER_LENGTH = 2;
}


