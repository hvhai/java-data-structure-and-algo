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
        log.info("A: {} ,z: {}", (int)'A', (int)'z');
        String s = "Let’s try, Mike!";
        log.info("removeAllPunctuationWithStream of {} is\n{} ",s, removeAllPunctuationWithStream(s));
    }

    static String removeAllPunctuationWithStream(String s) {
        return s.chars()
            .filter(c -> c > 64 && c < 123 || c == ' ')
            .mapToObj(Character::toString)
            .reduce(String::concat)
            .orElse("");
    }

}
