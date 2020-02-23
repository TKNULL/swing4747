/**
 * @author shuyun
 * @since 2020/2/19 10:41
 */
package shortanswerquestion;



//08-19年的简答题，大概在18分左右，每题3-4分

import java.util.ArrayList;
import java.util.Arrays;

public class ShortAnswer {

    public static void main(String [] args){

    }

























    /**
     *  位移运算符
     *      位移运算符的运算对象是二进制的bit,只可用来处理基本数据类型中的整数类型。
     *      左移操作符<<、右移操作符>> 、无符号右移操作符>>>
     *      二进制的四则运算，最后都可归为加法运算和移位
     *
     *  二进制：逢二进一
     *      二进制转十进制：
     *          按权展开求和：1011 = 1*2的3次方 + 0*2的2次方 + 1*2的1次方 + 1*2的0次方  = 8+0+2+1=11
     *      十进制转二进制：
     *          整数部分：除2取余，逆序排列（最后一个商开始，依次向上取数字）
     *          小数部分：乘2取整（取整后，继续用小数部分*2，直到小数部分为0）
     *  通用进制转换：
     *      不同进制之间的转换，本质是确定各个不同权值位置上的数码。？？？？todo
     *
     *
     * */








    /**
     *  判断一个数是不是质数
     *
     *  质数（素数）：质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数；否则称为合数。
     *  判断一个数是不是质数的编程思路：
     *      在一般领域，对正整数n，如果用2到根号n之间的所有整数去除，均无法整除，则n为质数。
     *      质数大于等于2 不能被它本身和1以外的数整除
     *
     * */
    public static Boolean test2(int n){
        if(n<=3){
            return n>1;     //n=2、3，为质数
        }
        for(int i =2;i<Math.sqrt(n);i++){       //java.lang.Math.sqrt()  方法可返回一个数的平方根。
            if(n%i==0){     // 根号n/2无法整除则为质数
                return false;
            }
        }
        return  true;
    }


    /**
     *【求一个数的最大公约数】-质因数分解
     *
     *  把一个合数用“质因数相乘”的形式表示出来，叫做分解质因数
     *  质数（素数）：质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数；否则称为合数。
     *  任何一个合数都可以分解成几个质数的积
     *  判断一个数是不是质数的编程思路：
     *      在一般领域，对正整数n，如果用2到根号n之间的所有整数去除，均无法整除，则n为质数。
     *      质数大于等于2 不能被它本身和1以外的数整除
     *
     * */
    public static void test1(Long n){
        n=8799635L;
        Long m = n;     //为了存储最初的n
        int flag = 0;
        String [] str = new String[50];
        //str存储可以被8799635整除，余数为0的数字
        for(long i = 2;i<=n;i++){
            if(n%i==0){
                str[flag] = Long.toString(i);
                flag++;
                n=n/i;
                System.out.println("n是："+n);        //1759927,135379,409,1
                i++;
            }
        }
        //System.out.println("str数组是："+ Arrays.toString(str)); //5, 13, 331, 409

        if(flag<2){      //如果数组str[]中有两个数字
            System.out.println(m+"为质数");        //当前数字是最小的质数
        }else{
            System.out.print(m+"="+str[0]);
            for(int k =1;k<flag;k++){
                System.out.print("*"+str[k]);         //8799635 = 5*13*331*409
            }
            System.out.println("\n"+m+"共有"+flag+"个质因数。");        //4
        }
    }



    /**
     *【求多个数的最大公约数】-短除法
     *  短除法运算方法是，先用一个除数除以能被它除尽的一个质数，以此类推，除到商是质数为止
     *
     * */
    // TODO: 2020/2/21 修改质因数求解法
    //分解质因数与短除法的区别
    //分解质因数：把每个数分别分解质因数，再把各数中的全部公有质因数提取出来连乘，所得的积就是这几个数的最大公约数
    //短除法：短除法求最大约数，先用这几个数的公约数连续去除，一直除到所有的商互质为止，然后把所有的除数连乘起来，所得的积就是这几个数的最大公约数



    /**
     *【求多个数的最大公约数】-辗转相除法（欧几里得算法）
     *  以除数和余数反复做除法运算，当余数为 0 时，取当前算式除数为最大公约数
     *
     * */
    public static int test3(int a,int b){
        if(a<=0 || b<=0){
            System.out.println("输入数据错误");
        }
        //保证除数比被除数大
        if(a<b) {
            int temp = 0;
            temp = a;
            a = b;
            b=temp;
        }
        int d = a%b;    //求余数
        while(d !=0){
            a=b;
            b=d;
            d=a%b;
        }
        System.out.println("辗转相除法，求两个数的最大公约数："+b);
        return b;
    }













































    /**
     *
     *  int length()
     *
     *  //比较内容，返回差值
     *  int compareTo(Object o)
     *	int compareTo(String anotherString)
     *  int compareToIgnoreCase(String str)
     *
     *  //比较内容，返回Boolean
     *  boolean equals(Object anObject)
     *  boolean equalsIgnoreCase(String anotherString)
     *  boolean contentEquals(StringBuffer sb)            // 与StringBuffer比较string的内容
     *
     *  //String判断
     *  boolean endsWith(String suffix)
     *  boolean startsWith(String prefix)
     *  boolean startsWith(String prefix, int toffset)
     *	boolean matches(String regex)
     *	boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
     *	boolean regionMatches(int toffset, String other, int ooffset, int len)
     *
     *  //String查找内容，返回索引值
     *  int indexOf(int ch)     //a=97,b=98,c=99
     *  int indexOf(int ch, int fromIndex)
     *  int indexOf(String str)
     *  int indexOf(String str, int fromIndex)
     *  int lastIndexOf(int ch)
     *	int lastIndexOf(int ch, int fromIndex)
     *	int lastIndexOf(String str)
     *  int lastIndexOf(String str, int fromIndex)
     *
     *  //String 增加
     *  String concat(String str)
     *
     *  //String 修改,或直接获取
     *  String toLowerCase()
     *  String toLowerCase(Locale locale)
     *  String toUpperCase()
     *	String toUpperCase(Locale locale)
     *  String replace(char oldChar, char newChar)
     *  String replaceAll(String regex, String replacement)
     *  String replaceFirst(String regex, String replacement)
     *  String substring(int beginIndex)
     *  String substring(int beginIndex, int endIndex)
     *	String[] split(String regex)
     *	String[] split(String regex, int limit)
     *  char charAt(int index)
     *
     *  //删除
     *  String trim()
     *
     *  //生成
     *  static String copyValueOf(char[] data)
     *	static String copyValueOf(char[] data, int offset, int count)
     *
     *  //转变
     *	byte[] getBytes()
     *  byte[] getBytes(String charsetName)
     *  char[] toCharArray()
     *  CharSequence subSequence(int beginIndex, int endIndex)  //转成CharSequence;   CharSequence cs = str.subSequence()
     *
     *  void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
     *  int hashCode()
     *  String intern()???
     *  String toString()
     *	static String valueOf(primitive data type x)
     *
     *
     * */

    /**
     * 【继承】
     * 子类拥有父类的非private属性、方法
     * 子类可以拥有自己的属性、方法
     * 子类可以用自己的方式实现父类的方法：重写，返回值和形参都不能变
     * Java支持单继承，但可以多重继承
     * 提高了类之间的耦合度，但是耦合度过高会造成代码之间紧密，独立性变差
     * extends  继承类
     * implements 继承接口   interface 创建接口类
     * super 访问父类的属性和方法
     * this  访问本类的属性和方法
     *
     * final类不能被继承，final方法不能被子类重写； final变量不能被修改
     * final类中的方法自动声明为final方法，但是变量并不是final
     *
     *  构造器：
     *      子类不能继承父类的构造器，但是子类一定会调用父类的构造器
     *      如果父类的构造器有参数，需要使用spuer.父类构造器(param) 来调用
     *      如果父类的构造器没有参数，无需显式调用，系统会自动调用
     *
     *  重写：
     *      参数列表必须完全相同
     *      返回类型<=父类类型（就是允许派生类）
     *      方法权限<=父类类型
     *      抛出异常<=父类类型
     *      声明为static的方法不能被重写，但是能被再次声明？？？  // TODO: 2020/2/20
     *      声明为final的方法不能被重写
     *      构造方法不能被重写（不能被继承，就不能被重写）
     *
     *
     **/


    /**
     * 【多态】：同一个事件，发生在不同对象上，会产生不同的结果
     *  多态存在的条件：继承、重写、父类引用指向子类对象：   ？？？？
     *  多态的实现方式：重写、接口、抽象类和抽象方法 ？？？？？
     *  // TODO: 2020/2/20  
     *
     *
     *
     *
     * */

    /**
     *【抽象类】
     *  1、抽象类不能被实例化，只能被继承。 一个类只能继承一个抽象类
     *  2、抽象类里面可以有成员变量、成员方法、构造方法，访问方式与普通类无差
     *  3、abstract 关键字来定义抽象类
     *  4、抽象方法：
     *      此方法只有方法名，没有方法体，具体实现有子类确定。
     *      抽象方法，方法名()，没有花括号
     *  5、如果一个类包含抽象方法，那此类必须是抽象类
     *  6、子类必须重写父类的抽象方法，除非子类本身也是抽象类
     *
     *  7、抽象类不一定包含抽象方法，但是包含抽象方法的类一定是抽象类
     *  8、构造方法、类方法（静态方法）不能被声明微抽象方法（不能用abstract修饰）
     *
     * */


    /**
     *  【接口】
     *  1、接口不是类，类用来描述对象的属性和方法，接口只包含类要实现的方法。（一个是人，一个是人的某个部件）
     *  2、抽象类、其他类是被继承，接口是被实现
     *  3、一个类实现接口，那此类必须实现接口中的所有方法，抽象类除外。
     *  4、接口与类的区别
     *      接口不能实例化对象
     *      接口没有构造方法
     *      接口中的所有方法必须是抽象方法（被隐式的指定为,且只能为 public abstract）
     *      接口不能包含成员变量，除了static和final变量（被隐式的指定为，public static final）
     *      接口不是被继承，而是被实现
     *      接口支持多继承
     *
     *
     * */



    /**
     *【数据结构】
     *  枚举（Enumeration）
     *  位集合（BitSet）
     *  向量（Vector）
     *  栈（Stack）
     *  字典（Dictionary）
     *  哈希表（Hashtable）
     *  属性（Properties）
     *  Java 集合框架
     *      集合Collection
     *      图 map
     *      
     *      // TODO: 2020/2/20  
     * */



    /**
     *【泛型】
     *  1、泛型方法  // TODO: 2020/2/20
     *       public static < E > void printArray( E[] inputArray ){}
     *       public static <T extends Comparable<T>> T maximum(T x, T y, T z){}
     *  2、泛型类  // TODO: 2020/2/20
     *
     *
     *
     *
     *
     *
     * */






    /**
     * 19.4
     * 21、请写出二元逻辑运算中的“短路”操作功能
     * 22、请写出用if语句实现计算 y =|x-5|的代码
     * 23、代码题 todo
     * 24、请写出为文本文件abc.txt创建BufferedReader对象in的代码
     * 25、请写出创建Font类型对象fn的代码，fn的属性值是Courier字体，BOLD样式，20磅字号
     *
     * */

    /**
     * 18.10
     * 21、设有整型变量nvar，当nvar的值为0时，输出nvar=0，否则输出nvar!=0。请写出使用if语句实现此功能的代码段。
     * 22、请写出一个接口中能够包含的元素，及这些元素各自默认的修饰符。
     * 23、请写出对类Strin9的两个对象进行相等判定时，使用“==”与equals()方法的不同。
     * 24、请写出方法覆盖的两个重要原则。
     * 25、设有定义File f=new File("／export／home／Test25．java")；，请写出获取f的文件名、文件路径名、文件父目录名称及文件长度的方法名。
     *
     **/


    /**
     * 18.04
     * 21、请写出Java语言中标识符的命名规则
     * 22、请写出package语句和import语句的区别
     * 23、请写出与整数相比，Vector对象的特点
     * 24、请写出用Thread类的子类创建线程并启动线程所包含的步骤
     * 25、请写出Java语言中的事件处理机制
     *
     **/

    /**
     * 17.10
     * 21、请写出“条件 x=2 与 y=3 有且只有一个成立”的表达式
     * 22、代码题 todo
     * 23、请写出在Java.awt.enevt中，用来检测并对时间做出反应的模型所包括的三种对象
     * 24、请写出在Java语言中，关键字synchronized的作用
     * 25、请写出采用缓冲输入方式，按行输入文件内容的步骤
     * 26、已知服务器的IP地址为host,端口号微port,请写出微客户端建立到服务器的套接字对象mySocket的代码（可能发生的例外类型微IOException）
     *
     **/

    /**
     * 17.04
     * 21、请写出表达式实现以下功能：变量y的值为5与变量z的值为3，有且只有一个成立
     * 22、请写出通过继承，子类可以获得的好处
     * 23、请写出将按钮对象b和文本区对象text放置于面板对象tp,并将tp放置于滚动面板，最后将滚动面板对象添加到JFrame子窗口对象frame的Java语句
     * 24、请写出Graphice2D类中的stroke、paint两种属性的作用
     * 25、请写出Java系统提供的支持文件随机访问的类和该类提供的读取一个字符的方法
     * 26、请写出URLConnection类型实现网络访问的基本过程
     **/


    /**
     * 17.10
     * 21、已知整型变量n，当n的值为0时，输出“正常”，否则输出“异常”。请写出使用switch语句实现此功能的代码。
     * 22、请写出在类、方法、变量之前加上修饰字final的作用。
     * 23、请列举出能产生ActionEvent事件类型的3种组件。
     * 24、某程序用以下代码弹出一个对话框： 程序题 todo
     * 25、请写出用矩形类Rectangle2D创建对象r的代码，对象r的左上角坐标是(20，30)，宽是50，高是70。
     * 26、URL对象的格式是：<METHOD>://<HOSTNAME:PORT>/<PATH>/<FILE>   ，请写出其中HOSTNAME的意义。
     **/


    /**
     * 16.04
     * 21、请写出使用for语句，输出所有既能够被3整除也能够被5整除的三位数的代码
     * 22、什么是类变量？什么是实例变量？类变量有什么特点？
     * 23、请写出FlowLayout布局的三种构造方法
     * 24、已知Graphics对象g，获得Graphics2D对象g2d,然后，用线段类创建线段对象line,该线段的起点坐标是（10，10），终点是（70，80）。请写出实现以上要求的Java代码
     * 25、简述用Runnalble接口实现多线程的主要工作
     * 26、请写出实现我呢见随机访问所使用的类的类名，以及该类常用的两种构造方式
     *
     **/


    /**
     * 15.10
     * 21、请写出表示以下条件的表达式：变量x的值为1与变量y的值微2，有且只有一个成立
     * 22、请写出通过继承创建子类的作用
     * 23、请写出将文本区text1和text2放置于面板P,并创建放置P的滚动面板jsp，最后将jsp添加到JFrame子窗口myFrame的Java语句
     * 24、请写出Java小应用程序播放音频文件需要用到的类的类名，以及创建相应对象的方法
     * 25、请写出Java系统提供的支持文件随机访问的类的类名，以及该类提供的读取一个整数的方法
     * 26、请写出URL对象能实现的功能
     *
     **/

    /**
     * 15.04
     * 21、代码题   todo
     * 22、简述在类的方法定义之前，分别使用修饰符final和abstract的作用是什么
     * 23、请写出将文本区对象ta防止与滚动面板jsp，并将jsp添加到当前框架窗口的内容面板中的Java语句
     * 24、已知Graphice对象g，获得Graphice2D对象g2d，然后创建并画出正方形对象rec,正方形的左上角坐标是（40，50），边长是70。请写出实现以上要求的代码。
     * 25、简述字符流数据与字节流数据的区别
     * 26、简述在编写Java网络应用程序时，应用URLConnection对象的作用
     *
     **/


    /**
     * 14.10
     * 21、代码题 todo
     * 22、使用super有哪三种情况?
     * 23、在Java的GUI编程中，有哪三种窗口类型?
     * 24、请写出向窗口增设菜单的步骤。
     * 25、请写出绘制左上角为(150，150)，半径为80的绿色圆形的语句。设调用的对象是类型为Graphics的g。
     * 26、请写出使用socket与另一方进行通信会话的过程。
     *
     **/


    /**
     * 14.04
     * 21、已知变量n，请写出使用for语句计算 的代码。  代码题 todo
     * 22、请写出接口体中可能包含的内容。
     * 23、请写出对事件对象作监视器注册的作用
     * 24、已知Graphics对象g，获得Graphics2D对象g2d，然后，用圆角长方形类创建对象 circle，该对象的左上角坐标是(30,40)，半径是50。请写出实现以上要求的Java代 码。
     * 25、某程序希望用FileFilter类的子类为打开文件对话框设置文件筛选条件。请写出设置 此筛选条件要使用的类及相应的方法。
     * 26、JDBC是Java程序与数据库连接的API。请写出JDBC能做的三件事情。
     *
     **/


    /**
     * 13.10
     * 21、代码题 todo
     * 22、为了系统安全，对JavaApplet小应用程序有什么限制？
     * 23、请写出声明int类型的二维数组intArr的三种形式
     * 24、请写出在JFrame框架窗口对象中添加组件的步骤
     * 25、请写出使用Graphics2D类声明并创建一个左上角为（20，30）、边长为50的正方形对象
     * 26、请写出使用纯Java JDBC驱动程序连接数据库的步骤
     *
     **/


    /**
     * 13.1
     * 21、代码题 todo
     * 22、请写出final类、final方法和final变量各自的含义
     * 23、请写出在程序中防止标签JLabel的基本步骤
     * 24、请写出绘制左上顶点为（50，50），右下顶点为（100，150），水平防止的红色矩形块的语句。设调用的对象是类型微Graphics的g.
     * 25、请写出sheep()和wait()的区别
     * 26、代码题 todo
     *
     **/


    /**
     * 12.10
     * 21、请写出表示条件“y右移一位后大于3并且y不等于0”成立的Java表达式。
     * 22、请写出类之间的is-a关系和类之间的has-a关系的含义
     * 23、请写出GridLayout布局的三种构造方法。
     * 24、 请写出使用Graphics2D类声明并创建一个左上角为(30，40)，宽是80，高为50的椭圆对象ellipse的语句。
     * 25、 请写出采用缓冲式输出时，程序由文件名创建缓冲式输出流的步骤。
     * 26、 请写出数据库更新操作中，删除数据表记录的3种方案各自所使用的对象。
     *
     **/


    /**
     * 12.1
     * 21、代码题 todo
     * 22、什么是方法重载，如何正确区分重载?
     * 23、请写出定义一个包含2个子数组的二维整型数组对象aArr的代码，其中第一个子数组有5个元素，第二个子数组有3个元素。
     * 24、请写出创建一个JPanel对象p，并为对象p设定GridLayout布局的代码。
     * 25、由于创建输出流对象时，可能会出现IOException异常，所以创建输出流对象的代码必须出现在try-catch语句结构中。请写出为当前目录下的myFile.dat文件创建缓冲输出流对象outs的代码。
     * 26、请写出已知数据库url、用户名uName和密码pWord，通过驱动程序管理器(DriverManager)的方法getConnection()建立连接con的代码，可能产生的异常是SQLException。
     *
     **/

    /**
     * 11.10
     * 21、请使用for循环语句实现计算 的值。 代码题 todo
     * 22、请写出Java语言中编写事件处理程序的两种方案。
     * 23、请写出代码段，用来创建一个标签对象1b1，显示文字为“Java”，背景色设为绿色。
     * 24、请写出JComboBox对象上可能发生的两种事件类型的名字。
     * 25、请写出线程从阻塞状态恢复到就绪状态的三种途径。
     * 26、请写出URLConnection类提供的获得输入输出流对象的方法和实现网络连接的方法。
     *
     **/

    /**
     * 10.10
     * 21、请使用for循环语句计算S=1+ 的值。  代码题  todo
     * 22、请写出Applet类中init()方法的功能
     * 23、请写出空布局安置组件的两个步骤
     * 24、在Swing中，对话框有几种?并请写出它们的主要区别。
     * 25、请写出用Runnable接口实现多线程的主要工作。
     * 26、请写出用InetAddress类，获取网址为“www.edu.cn”的IP地址的Java语句。
     *
     **/

    /**
     * 10.01
     * 21、请写出一段if语句，判断一个整数n是否为偶数。如果是偶数，输出“Yes.”；否则,输出“No．”。
     * 22、请写出接口定义的一般形式。
     * 23、请写出Java语言编写事件处理程序的两种主要方案。
     * 24、设已经有Graphics2D对象g2d, 请用Java语句绘制一个矩形rect，其左上角坐标是(20，30)，宽是120，高是30
     * 25、打开文件对话框时，还可以设置筛选条件，即指定文件的类型。请写出FileFilter类预设的两个方法。
     * 26、请写出URLConnection类提供的三个常用方法。
     **/

    /**
     * 09.10
     * 21、请写出实现计算y=|x|的if语句。
     * 22、以下代码定义了一个类，请指出其中三条不合法的代码行(行号参见注释)  代码题 todo
     * 23、在java.awt.event中，用来检测并对事件做出反应的模型涉及三种对象。请写出这三种对象。
     * 24、写出设置Font对象fn的Java语句，要求Courier字体，BOLD风格，18磅字号，设调用对象的类型为Graphics的g。
     * 25、通过流的构造方法建立文件流对象，请写出创建输入输出文件流对象的两种常用构造方法。
     * 26、当Client程序和Server程序需要通信时，可以用Socket类建立套接字连接，请写出双方实现通信的两种方式。
     *
     **/

    /**
     * 09.1
     * 21、请写出表示year年是闰年的Java表达式。闰年的条件是：每4年一个闰年，但每100年少一个闰年，每400年又增加一个闰年。
     * 22、请写出在类的方法的定义之前，加上修饰字public、private的区别。
     * 23、请写出将文本区text放置于滚动面板jsp，并将滚动面板jsp添加到JFrame窗口myFrame的Java语句。
     * 24、要用Graphics2D类的方法画一个图形，首先要把参数对象g强制转换成Graphics2D对象；然后，用图形类提供的静态方法Double()创建一个图形对象；最后，以图形对象为参数调用Graphics2D对象的draw()方法绘制这个图形。请写出用这样的方法绘制一条线段的程序段，线段的两个端点分别是(10.0，10.0)和(30.0，30.0)。
     * 25、请写出字符流数据与字节流数据的区别。
     * 26、请写出URLConnection类在编写Java网络应用程序中的作用。
     *
     **/

    /**
     * 08.10
     * 21、请写出表示条件“x=2与y=3有且只有一个成立”的Java表达式”。
     * 22、.如果类Student是类Person的子类，类Undergraduate是类Student的子类，请指出以下代码行中哪些是不合法的。
         * Person p1=new Student();
         * Person p2=new Undergraduate();
         * Student s1=new Person();
         * Student s2=new Undergraduate();
         * Undergraduate ug1=new Person();
         * Undergraduate ug2=new Student();
         * Object ob=new Student();
     * 23、请写出程序处理文本框输入结束事件（回车）添加监视器的方法，以及监视器类必须实现的接口方法。
     * 24、请写出一条语句，能够绘制一条从点（20，30）开始，长为100像素的水平线段。设调用的对象是类型为Graphics的g
     * 25、某Java程序要使用文件输入输出流，请写出该程序所需要的import语句。
     * 26、JDBC是Java程序与数据库连接的API，请写出JDBC能做的三件事情。
     *
     **/





}
