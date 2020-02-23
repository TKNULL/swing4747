/**
 * @author shuyun
 * @since 2020/2/18 14:14
 */
package programming.debug1904;


public class Test {
    /**
     * 【19.4-六、程序设计 1】
     * Q:返回已知整数数组a内的第一个小于指定值key的元素的下标，若没有找到小于key的元素，则返回-1
     *
     * @author shuting.guo
     * @since 2020/02/13
     **/




    public int lessKeyFirst0219(int [] a,int key){
        int result =-1;
        //遍历列表，对比每个数据,当发现第一个符合条件的数字，就退出
        for(int i=0;i<a.length;i++){
            if(key<a[i]){
                result =i;
                break;
            }
        }
        //如果找不到符合条件的，就返回-1
        return result ;
    }


    private int lessKeyFirst0218(int[] a, int key) {
        int result = -1;
        for (int i = 0; i < a.length; i++) { //遍历a数组，遍历a.length次
            if ( key<a[i]) {
                result = i;
                break;
            }
        }
        return result;
    }







    public static void main(String [] args){


    }



}






















// //答案
// private int lessKeyFirst1(int[] a, int key) {
//     for(int i=0;i<a.length;i++){
//         if(a[i]<key){
//             return i;
//         }
//         return -1;
//     }
// }

