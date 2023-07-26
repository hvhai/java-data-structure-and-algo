package org.codehunter.chap1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Write a short Java method that uses a StringBuilder instance to remove all the
 * punctuation from a string s storing a sentence, for example, transforming the
 * string "Let’s try, Mike!" to "Lets try Mike".
 */
public class R19 {
    public static final Logger log = LogManager.getLogger(R19.class);

    public static void main(String[] args) {
        log.info("A: {} ,z: {}", (int) 'A', (int) 'z');
        String s = "Let’s try, Mike!";
        String removeAllPunctuationWithStream = removeAllPunctuationWithStream(s);
        log.info("removeAllPunctuationWithStream of {} is\n{} ", s, removeAllPunctuationWithStream);
        String removePunctuations = removePunctuations(s);
        log.info("removePunctuations of {} is\n{} ", s, removePunctuations);
    }

    static String removeAllPunctuationWithStream(String s) {
        if (s == null) return "";
        return s.chars()
                .filter(c -> c > 64 && c < 123 || c == ' ')
                .mapToObj(Character::toString)
                .reduce(String::concat)
                .orElse("");
    }

    static String removePunctuations(String string) {
        if (string == null) return "";
        /*
         * replace all method takes two arguments first one is regex pattern in which
         * you mention pattern applicable to remove all punctions in the string and in
         * the second argument we pass the which one we want to replace with regex
         * pattern to remove all punctuations look like below.
         */
        string = string.replaceAll("\\p{P}", "");

        return string;

    }
}
