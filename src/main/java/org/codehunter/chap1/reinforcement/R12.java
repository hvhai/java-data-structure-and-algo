package org.codehunter.chap1.reinforcement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Suppose that we create an array A of GameEntry objects,
 * which has an integer scores field, and we clone A and store the result in an array B.
 * If we then immediately set A[4].score equal to 550,
 * what is the score value of the GameEntry object referenced by B[4]?
 */
public class R12 {
    public static final Logger log = LogManager.getLogger(R12.class);
    public static void main(String[] args) {
        GameEntry[] a = {
                new GameEntry(0),
                new GameEntry(1),
                new GameEntry(2),
                new GameEntry(3),
                new GameEntry(4),
                new GameEntry(5),
        };
        GameEntry[] b = a.clone();
        a[4].score = 550;
        log.info(b[4].score);


    }

    static class GameEntry {
        int score;

        public GameEntry(int score) {
            this.score = score;
        }
    }
}
