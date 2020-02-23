/**
 * @author shuyun
 * @since 2020/2/21 18:04
 */
package oos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DSdemo {
    public static void main(String [] args){
        Employee e = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("D:/workspace/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            e = (Employee)in.readObject();
            in.close();
            fileInputStream.close();

        }catch(IOException i){
            i.printStackTrace();
        }catch (ClassNotFoundException c){      //对于JVM可以反序列化对象，必须是能够找到字节码的类，如果在反序列化对象的过程中找不到此类，会抛出此异常。
            System.out.println("文件没找到："+c.toString());
            c.printStackTrace();
            return;
        }
        System.out.println("反序列化");
        System.out.println("name:"+e.name);
        System.out.println("address:"+e.address);
        System.out.println("ssn:"+e.SSN);
        System.out.println("number:"+e.number);
    }
}
