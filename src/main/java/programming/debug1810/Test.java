/**
 * @author shuyun
 * @since 2020/2/18 14:36
 */
package programming.debug1810;

/**
 * 【18.10-六、程序设计 1】
 * Q:编写方法double sumS(int n),该方法计算以下表达式前N项的和S，并返回
 *后一项的分母=前一项的分子，后一项的分子=前一项分子与分母的和
 * @author shuting.guo
 * @since 2020/02/13
 **/
public class Test {
    public static void main(String [] args){
        sumS1( 5 );
        sumS0219(5);
    }








    public static double sumS0219(int n){
        double sum=0.0;
        double fz=2.0;
        double fm=1.0;
        double temp; //临时存储数据
        int flag = 1;       //任何数字*1都等于原数字本身； 任何数字*-1,都等于原数字取反
        for(int i=0;i<n;i++){
            sum = sum+flag*(fz/fm);
            temp = fz;
            fz = fz+fm;
            fm=temp;
            flag = -flag;
        }
        System.out.println("sum："+sum);

        return sum;
    }


    public static double sumS1(int n){
        double S,fz,fm,temp;
        int flag;
        S=0.0;
        fz=2.0;
        fm=1.0;
        flag =1;

        for(int i=0;i<n;i++){
            S=S+flag*fz/fm;        //计算第一项             //计算每一项
            temp = fm;             //保存第一项的分母
            fm=fz;                 //计算第二项的分母
            fz+=temp;//fz=temp+fz  //计算第二项的分子
            flag=-flag;            //计算运算符号
        }
        System.out.println("s："+S);
        return S;

    }
}
