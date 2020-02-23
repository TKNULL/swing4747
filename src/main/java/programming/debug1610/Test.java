/**
 * @author shuyun
 * @since 2020/2/18 16:52
 */
package programming.debug1610;


/**
 * 【16.10 -六、程序设计 1】
 *
 *  编写int countOddNum(int [] a),功能是，求已知数组a中奇数的个数
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/
public class Test {
    public static void main(String [] args){
        int [] a = {1,2,3,4,5,6,7,8,9,9,9,9,9,9,9};
        countOddNum(a);

    }
    public static int countOddNum(int [] a){
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==1){
                System.out.println("当前数字是："+a[i]);
                count+=1;
            }
        }
        System.out.println("当前数组中的奇数个数是："+count);
        return count;
    }
}
