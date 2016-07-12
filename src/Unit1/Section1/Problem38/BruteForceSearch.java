package Unit1.Section1.Problem38;

/**
 * DeadLine:7.12
 *
 * 题目1.1.38
 * 实现一个二分查找
 * 暴力查找就是沿着数组顺序开始搜索
 * 实现计时可以使用如下方法
 * 使用GregorianCalendar.getInstance().getTimeInMillis()  注意返回值是long
 * 得到1970年1月1日到当前毫秒数之差，
 * 在程序开始和结束的时候分别调用这个方法，相减得到一个差就是程序所用的毫秒数
 */
public class BruteForceSearch {
    public static void main(String[] args) {

    }
    public static int rank(int[] a,int key){
        //TODO
        for (int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
}
