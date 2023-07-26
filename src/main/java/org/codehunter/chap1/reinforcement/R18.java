package org.codehunter.chap1.reinforcement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a short Java method that counts the number of vowels in a given character string.
 */
public class R18 {
    public static final Logger log = LogManager.getLogger(R18.class);

    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        String value = "Hello word";
        log.info("countVowel of string: {} is: {} | Calculated in {}", value, countVowel(value), System.currentTimeMillis() - currentTime);
        log.info("countVowelByRegex of string: {} is: {} | Calculated in {}", value, countVowelByRegex(value), System.currentTimeMillis() - currentTime);
    }

    static long countVowel(String value) {
        if (value == null) return 0;
        return value.toLowerCase()
                .chars()
                .filter(i -> i == 'a' || i == 'i' ||
                        i == 'e' || i == 'o' || i == 'u')
                .count();
    }

    static long countVowelByRegex(String value) {
        if (value == null) return 0;
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(value);
        // global match
        List<String> matchList = new ArrayList<>();
        while (matcher.find()) {
            matchList.add(matcher.group());
        }
        return matchList.size();

    }
}
