package hbcu.stay.ready.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int ans = 0;
        for (int i=0; i<n;i++){

            ans=ans+i;
        }
        return ans;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String theString = val.toString();
        String[] nums = theString.split("\\W+");

        return Integer.valueOf((String.valueOf(nums)));


    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        return val%2==0;
    }
}

