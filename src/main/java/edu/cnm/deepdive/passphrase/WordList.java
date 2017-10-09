package edu.cnm.deepdive.passphrase;

import com.sun.org.apache.regexp.internal.RE;
import edu.cnm.deepdive.passphrase.util.Constants;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class WordList {

   private final String[] words;

   private static class Singleton {
      private static final WordList INSTANCE = new WordList();
   }
   private WordList() {
      ResourceBundle bundle = ResourceBundle.getBundle(Constants.WORDS_BUNDLE);
      List<String> wordlist = new LinkedList<>();
      for (Enumeration<String> e = bundle.getKeys(); e.hasMoreElements(); ) {
         wordlist.add(bundle.getString(e.nextElement()));
      }
      words = wordlist.toArray(new String[wordlist.size()]);
   }

   public static String get(Random rng) {
      return Singleton.INSTANCE.words[rng.nextInt(Singleton.INSTANCE.words.length)];

   }

}
