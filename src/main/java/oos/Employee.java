/**
 * @author shuyun
 * @since 2020/2/21 17:52
 */
package oos;


import java.io.Serializable;

/**
 * Java序列化
 * 1、一个对象可以被表示为一个字节序列，字节序列包括该对象的数据、有关对象的类型的信息、存储在对象中数据的类型。把对象转换为字节序列的过程，称为对象的序列化。
 * 2、将序列化对象写入文件之后，可以从文件中读取出来，并对它进行反序列化：对象的数据、对象中的数据类型可以用来在内存中新建对象。
 *      用于传输对象，传输过程中，保持对象的特征：属性、属性值、对象状态
 * 3、writeObject（） readObject（）
 * 4、一个类要实现序列化的条件：
 *      必须实现 java.io.Serializable 接口（可以用来检验类是否可序列化）
 *      该类的所有属性必须是可序列化的，如果有一个属性是不可序列化的，则该属性必须注明是短暂的（transient ）
 * 5、序列化可以保存：非静态成员变量（静态变量不参与序列化，是说静态变量永远不变？？）
 * 6、序列化的用途：把对象的字节序列永久保存在硬盘上；  在网络上传输对象的字节序列；
 */

public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void print(){
        System.out.println("我是Employee对象，name："+name+",address:"+address);
    }
}
