package wc.wordcounter;

import java.util.ArrayList;

/**
 * Created by user on 27/02/2017.
 */

public class StringSplitter {

ArrayList<String> countingArray;


        private String input;

        public StringSplitter(String input) {

            this.input = input;
        }

        public ArrayList<String> splitString() {
            countingArray = new ArrayList<String>();

            String[] words = input.split(" ");
            for (String s : words) {
                countingArray.add(s);
            }
return countingArray;
        }

static int countWords(ArrayList<String> counts) {

    return counts.size();


}

}
