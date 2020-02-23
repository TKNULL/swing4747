/**
 * @author shuyun
 * @since 2020/2/18 15:39
 */
package programming.debug1804;



/**
 * 【18.04-六、程序设计 1】
 *
 * 编写方法invertArray(int a []) ,此方法返回一个数组b，b中元素顺序为数组a中元素的逆序
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/
public class Test {
    public static void main(String [] args){

        int a [] = {1,2,3,4,5};
        invertArray(a);
    }

    public static int [] invertArray(int a[]){
        int b [] = new int[a.length];
        for(int i=0;i<a.length;i++){
            //b[i]= a[a.length-1];  //==> b[i] = a[5-1] = a[4] =5
            //b[i]= a[a.length-i];  //==>b[i] = a[5-0](i在第一次循环时是0)  ==a[5],a[4],a[3],a[2],a[1],   a[]的下标最多到4,
            b[i] = a[a.length-i-1];
        }
        System.out.println("结果是："+b.length);
        System.out.println("结果是："+b[0]);
        System.out.println("结果是："+b[1]);
        System.out.println("结果是："+b[2]);
        System.out.println("结果是："+b[3]);
        System.out.println("结果是："+b[4]);

        return b;
    }


















    // public static int[] invertArray(int [] a){
    //     int b [] = new int[a.length];
    //     for(int i=0;i<a.length;i++){
    //         b[i]= a[a.length-i-1];   //a.length =5,是1-5；访问下标是0-4；所以需要-1；      b1=a4;b2=a3;b3=a2;ba=a1;b5=a0
    //     }
    //     return b;
    //
    // }
}
