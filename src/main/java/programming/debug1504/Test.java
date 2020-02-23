/**
 * @author shuyun
 * @since 2020/2/18 18:14
 */
package programming.debug1504;

/**
 * 【15.04 -六、程序设计 1】
 *
 * 编写方法int revInt(int a),该方法的功能是返回与十进制正整数a的数字顺序相反排列的正整数。 如已知正整数是12345，返回54321.
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/

public class Test {
    public static void main(String [] args){

        revInt(12345);

    }
    public static int revInt(int a){
        int s =0;
        while(a!=0){
            s=s*10 + a%10;
            a/=10;
        }
        System.out.println("s是："+s);
        return s;

    }

}
