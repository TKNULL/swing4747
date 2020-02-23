/**
 * @author shuyun
 * @since 2020/2/18 16:26
 */
package programming.debug1704;


/**
 * 【17.04-六、程序设计 1】
 *
 * 编写方法 double sumSequence(int n),该方法功能是求一下数列前n项的和s并返回
 * s=1/2 + 2/3 + 3/5 + 5/8 + 8/13 +......
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/



public class Test {
    public static void main(String [] args){
        sumSequence(5);
        sum(5);
    }

    //思索
    public static double sumSequence(int n){
        double fz = 1.0;
        double fm = 2.0;
        double temp =0.0;
        double S =0.0;
        for(int i=0;i<n;i++){
            S+=fz/fm;
            temp = fz;
            fz = fm;
            fm +=temp;
        }
        System.out.println("sumSequence,当前s的值是："+S);
        return S;
    }

    //答案
    public static double sum( int n){
        int i;
        double sum =0.0,numerator = 1.0,denominator = 2.0,t;
        for(i=0;i<n;i++){
            sum+=numerator/denominator;
            t=numerator+denominator;
            numerator=denominator;
            denominator=t;
        }
        System.out.println("sum,当前sum的值是："+sum);

        return sum;

    }



}
