package Unit1.Section1.Problem38;

import java.util.GregorianCalendar;

/**
 * DeadLine:7.12
 * 题目1.1.38
 * 实现一个二分查找
 * 查找问题相关看书上面的描述
 * 实现计时可以使用如下方法
 * 使用GregorianCalendar.getInstance().getTimeInMillis()  注意返回值是long
 * 得到1970年1月1日到当前毫秒数之差，
 * 在程序开始和结束的时候分别调用这个方法，相减得到一个差就是程序所用的毫秒数
 */
public class BinarySearch {
    public static void main(String[] args) {

    }

    public static int rank(int[] a, int key, int lo, int hi){
        //TODO
      if(a[lo]>a[hi])return -1;
        int mid=(hi-lo)/2+lo;
        if(a[mid]==key){
            return mid;}
        else if(key<a[mid]){
            return rank(a,key,lo,mid);
        }else {
            return rank(a,key,mid,hi);
        }
    }
}
