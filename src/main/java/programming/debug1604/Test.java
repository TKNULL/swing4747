/**
 * @author shuyun
 * @since 2020/2/18 17:06
 */
package programming.debug1604;

/**
 * 【16.04 -六、程序设计 1】
 *
 * 编写 boolean isDuplicated(int [] a),该方法判断数组a[]中是否存在相同的元素，如果存在相同的元素则返回真值，否则返回假值
 *
 * @author shuting.guo
 * @since 2020/02/13
 **/
public class Test {
    public static void main(String [] args){
        int [] a = {1,2,3,4};
        isDuplicated(a);

    }

    //循环：  外循环a.length()遍，内循环a.length-1遍
    public static boolean isDuplicated(int [] a){
        boolean flag=false;
        for(int i=0;i<a.length;i++){        //i循环4遍
            System.out.println("i是："+i);
            for(int j=i+1;j<a.length;j++){  //循环3、2、1遍
                System.out.println("j是："+j);
                System.out.println("a[i]是："+a[i]);
                System.out.println("a[j]是："+a[j]);

                if(a[i]==a[j]){
                    flag=true;
                    break;
                }
            }
        }
        System.out.println("当前flag是："+flag);
        return flag;
    }
}
