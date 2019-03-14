package io.zipcoder;

import java.util.Arrays;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        while (stringIterator.hasNext()) {
            String next = stringIterator.next();
            // mundane task to fuck up timing
            Double[] array = new Double[33333];
            for (int i = 0; i < 33333; i++) {
                array[i] = Math.random();
            }
            Arrays.sort(array);
            //
            copied += next + " ";
        }
    }
}
