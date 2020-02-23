/**
 * @author shuyun
 * @since 2020/2/18 17:54
 */
package programming.debug1510;


/**
 * 【15.10 -六、程序设计 1】
 *
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/
public class Test {
    public static void main(String  [] args){

    }
    public static double sumS(int n ){
        double sum,fz,fm,temp;
        sum=0.0;
        fz=2.0;
        fm=1.0;
        temp=0.0;
        for(int i=0;i<n;i++){
            //计算
            sum += fz/fm;
            //计算分子
            temp = fz;
            fz = fz+fm;
            //计算分母
            fm=temp;
        }
        return sum;

    }
}
