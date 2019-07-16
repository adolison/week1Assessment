package hbcu.stay.ready.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] words = sentence.split("\\W+");
        return words;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] words = sentence.split("\\W+");
        return words[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] words = sentence.split("\\W+");
        StringBuilder newInput = new StringBuilder();
        StringBuilder first = newInput.append(words[0]);
        first.substring(0, 1).toLowerCase();
        //first.substring(1);

        first.reverse();
        String reverse = first.toString();
        //reverse =reverse.substring(7).toLowerCase();

        String camel= reverse.substring(0, 1).toUpperCase()+reverse.substring(1);
        //return camel+words[1];
        //return camel.substring(7).toLowerCase();
        return reverse +" "+ words[1];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {

        String[] words = sentence.split("\\W+");
        StringBuilder newInput = new StringBuilder();
        StringBuilder first = newInput.append(words[0]);
        String firstWord = first.substring(0, 1).toLowerCase() + first.substring(1);

        StringBuilder sb = new StringBuilder();

        // 1. convert String to StringBuilder
        // using append() method
        StringBuilder hah = sb.append(firstWord);//.substring(0, 1).toLowerCase() + firstWord.substring(1));
        StringBuilder reverseFirstWord = hah.reverse();
        String theFirstWord = reverseFirstWord.substring(0, 1).toUpperCase()+reverseFirstWord.substring(1);

        StringBuilder forWordTwo = new StringBuilder();

        StringBuilder second = forWordTwo.append(words[1]);
        String secondWord = second.substring(0,1).toUpperCase() + second.substring(1);

        return theFirstWord+secondWord;

    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        return str.substring(0, index) + str.substring(index + 1);
        //return null;
    }

}
