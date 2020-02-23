/**
 * @author shuyun
 * @since 2020/2/21 17:54
 */
package oos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SDemo {
    public static void main(String [] args){
        Employee e = new Employee();
        e.name="test";
        e.address="shanghai";
        e.SSN=123456;
        e.number=11;

        try{
            //文件：打开文件
            FileOutputStream fileOutputStream = new FileOutputStream("D:/workspace/employee.ser");
            //序列化
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            //序列化：写入
            out.writeObject(e);
            //序列化：关闭
            out.close();
            fileOutputStream.close();
            System.out.println("正在序列化对象,指定文件路径下会生成employee.ser文件。");
        }catch (IOException ie){
            ie.printStackTrace();
        }

    }

}
