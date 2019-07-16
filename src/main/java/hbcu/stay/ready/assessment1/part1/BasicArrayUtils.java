package hbcu.stay.ready.assessment1.part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        //String stop = stringArray[0];
        return stringArray[0];

        //alert(ary[0])

    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        /*String theString= stringArray.toString();
        String[] words = theString.split("\\W+");
        StringBuilder newInput = new StringBuilder();
        newInput.append(words[0]);
        String hey = newInput.toString();
        return new String[]{hey};*/

        List<String> list = Arrays.asList(stringArray);
        Collections.reverse(list);
        stringArray = (String[]) list.toArray();
        System.out.println(stringArray);
        return stringArray;


        /*rverse(stringArray,0,stringArray.length);
        String[] ans = null;
        for (int i=stringArray.length;i>0;i--){
            ans = stringArray[i];
        }

        return String[]{ans};*/
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        /*String[] words = stringArray.toString().split("\\W+");
        StringBuilder newInput = new StringBuilder();
        StringBuilder first = newInput.append(words[0]);
        String firstWord = first.substring(0, 1);//.toLowerCase() + first.substring(1);*/

        /*StringBuilder sb = new StringBuilder();

        // 1. convert String to StringBuilder
        // using append() method
        StringBuilder hah = sb.append(firstWord);//.substring(0, 1).toLowerCase() + firstWord.substring(1));
        StringBuilder reverseFirstWord = hah.reverse();
        String theFirstWord = reverseFirstWord.substring(0, 1).toUpperCase()+reverseFirstWord.substring(1);

        StringBuilder forWordTwo = new StringBuilder();

        StringBuilder second = forWordTwo.append(words[1]);
        String secondWord = second.substring(0,1).toUpperCase() + second.substring(1);*/
        //System.out.println(words[0].substring(0,1)+words[1].substring(0,1)+words[2].substring(0,1)+words[3].substring(0,1));
        //return stringArray[0];
        /*System.out.println(words[0].substring(0,1));
        System.out.println(words[1].substring(0,1));
        System.out.println(words[2].substring(0,1));
        System.out.println(words[3].substring(0,1));
        System.out.println(firstWord);*/


        return String.valueOf(stringArray[0].split(String.valueOf(0))); //stringArray[1].split(String.valueOf(1));
    }
}
