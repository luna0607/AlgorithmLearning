package Unit1.Section1.Problem38;

import java.util.GregorianCalendar;

/**
 * Created by Ariana on 2016/7/11.
 */
public class Test {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10,23,45,46,47,67,69,100,234,235,246,247,261};
        long b= GregorianCalendar.getInstance().getTimeInMillis();
        System.out.println("key located in"+ BinarySearch.rank(a,247,0,a.length-1));
        long c=GregorianCalendar.getInstance().getTimeInMillis();
        System.out.println("BinarySearch use "+(c-b)+" ms");

         b= GregorianCalendar.getInstance().getTimeInMillis();
        System.out.println("key located in"+ BruteForceSearch.rank(a,247));
        c=GregorianCalendar.getInstance().getTimeInMillis();
        System.out.println("BruteForceSearch use "+(c-b)+" ms");
    }
}
