/**
 * @author TK
 * @since 2020/2/20 23:57
 */
package swing.swingassembly;

// 1、B
//         2、#  位移
//         3、# 待定
//         4、B
//         5、D
//         6、D 接口
//         7、A 对象序列化
//         8、C GirdLayout 网格布局
//         9、#  创建菜单项
//         10、#A 多线程
//
//
//         11、Java -version
//         12、int
//         13、import
// 14、自动装箱
//         15、#  String类的方法
//         16、#  类与类之间的关系
//         17、#  BufferReader类的方法
//         18、#  keyListener接口的作用 ？？？
//         19、#  Swing组件在哪个包中？？？
//         20、#  多线程
//
//
//         21、 二元逻辑运算中的短路
//         22、 pass
//         23、
//         24、 BufferReader类的方法及使用
//
//         25、 #Font f = new Font("Courier","BOLD",)  Font类的构造方法
//         26、 #最大公约数
//         27、 #JPanel JList 代码
//         28、 #JPanel JTextField
//         29、 #位运算
//         30、 #类继承中，super的作用
//
//
//
//         #
//         待完成：
//         1、最大公约数求解方法的算术版+代码版
//         质因数分解法
//         短除法
//         辗转相除法
//         更相减损法


















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
 * 组合框与列表
 *      JComboBox 下拉式菜单
 *      JList 列表
 * 文本组件
 *      JTextField 文本域
 *      JPasswordField 口令输入域
 *      JTextArea 文本区
 * 菜单组件
 *      JMenuBar
 *      JMenuItem
 *      JMenu
 *      JCheckBoxMenuItem  复选菜单项
 *      JRadioButtonMenuItem  单选菜单项
 *      JPopupMenu
 * 对话框
 *      JDialog 自定义对话框
 *      JOptionPane 标准对话框
 *      JFileChooser
 *
 *
 *
 * */









public class Info {

}
