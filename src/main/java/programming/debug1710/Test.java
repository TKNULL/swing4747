/**
 * @author shuyun
 * @since 2020/2/18 16:08
 */
package programming.debug1710;

/**
 * 【17.10-六、程序设计 1】
 *
 * 编写方法 int searchMaxNumIndex(int [] a),该方法的功能是返回已知数组中最大数的下标
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/


public class Test {
    public static void main(String [] args){
        int [] a = {1,2,3,4,5,6,5,4,3,7,8,0,0};
        //searchMaxNumndex(a);
    }




    public static int searchMaxNumIndex(int [] a){
        int max =0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=i;
            }
        }
        return max;
    }






















    // public  static int searchMaxNumndex(int [] a){
    //     int max =0;
    //     int maxIndex=0;
    //     for(int i=0;i<a.length;i++){
    //         if(a[i]>max){
    //             max=a[i];
    //             maxIndex=i;
    //         }
    //     }
    //     System.out.println("当前最大值是："+max);
    //     System.out.println("当前最大值下标是："+maxIndex);
    //
    //     return max;
    // }
}
