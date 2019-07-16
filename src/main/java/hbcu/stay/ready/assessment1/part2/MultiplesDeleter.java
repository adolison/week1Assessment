package hbcu.stay.ready.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public static Integer[] deleteEvens(Integer[] ints) {
        //ArrayList oddInts = new ArrayList();
        Integer[] oddInts = new Integer[ints.length/2];

        for (int i =0;i<=ints.length;i++){
            if (ints[i]%2==1){
                //ArrayList oddInts = new ArrayList();
                ints[i]=oddInts[i];
            }
        }
        /*String str[] = new String[oddInts.size()];
        Object[] objArr = oddInts.toArray();
        int i = 0;
        for (Object obj : objArr) {
            str[i++] = (String)obj;
        }*/

        return oddInts;



        //return (Integer[]) oddInts.toArray();
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public static Integer[] deleteOdds(Integer[] ints) {
        /*ArrayList evenInts = new ArrayList();//ints.length / 2];

        Integer[] hah = new Integer[0];
        for (int i = 0; i <= ints.length; i++) {
            if (ints[i] % 2 == 0) {
                //ArrayList oddInts = new ArrayList();
                //ints[i] = (Integer) evenInts.get(i);
                evenInts.add(ints[i]);
            }
            int[] arr = new int[evenInts.size()];

            for(int j = 0; j < evenInts.size(); j++) {
                if (evenInts.get(j) != null) {
                    arr[i] = (int) evenInts.get(i);
                }
            }

           // hah = new Integer[]{ints[i]};
            //hah = evenInts;
            return new Integer[]{arr[0]};
            //return new Integer[]{ints[i]};
        }
        /*Integer[] intArr = null;
        intArr = evenInts.to(new Integer([intArr.size()]))
        System.out.println(ints);
        return null;

        Integer strArr = evenInts(new String[0]);
        System.out.println(Arrays.toString(strArr));
    */
        return null;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {
        //ints[1, 2, 3, 4, 5, 6, 7, 8, 9, 0];
       /* Integer[] filtered = ints.filter(function(value, index, arr){

            return value > 5;

        for (int i=0;i<ints.length;i++){
            if (ints[i]%3!=0){
                ints.splice(i,1);
            }
        }*/
        return null;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public static Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        return null;
    }
}
