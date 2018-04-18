package filestream;
import java.io.*;
public class TestFile {
    public static void main(String[] args) throws IOException {
        //初始化文件路径
        File file = new File("E:"+File.separator+"JAVA"+File.separator+"workspace"+File.separator+"JavaStudy"+File.separator+"test.txt");

        //判断父目录是否存在，不存在则新增
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdir();
        }

        //字节输出流：输出到文件
        FileOutputStream out = new FileOutputStream(file,true);
        String text = "【字节输出流：输出到文件】";
        out.write(text.getBytes());
        out.close();

        //字节输入流，输入到程序
        FileInputStream input = new FileInputStream(file);
        byte data [] = new byte[1024];
        int count = 0;
        int temp = 0;
        while ((temp = input.read()) != -1){
            data[count++] = (byte) temp;
        }
        input.close();
        System.out.println(new String(data,0,count));

        //字符输出流
        FileWriter write = new FileWriter(file,true);
        text = "【字符输出流】";
        write.write(text);
        //flush()=>强制清理缓冲区
        //write.flush();
        write.close();

        //字符输入流
        FileReader reader = new FileReader(file);
        char cdata [] = new char[1024];
        int len = reader.read(cdata);
        System.out.println(new String(cdata,0,len));

        //转换流：字节输出流=>字符输出流
        FileOutputStream fout = new FileOutputStream(file,true);
        Writer w = new OutputStreamWriter(fout);
        w.write("【转换流】");
        fout.close();
        w.close();

        //转换流：字节输入流=>字符输入流
        FileInputStream finput = new FileInputStream(file);
        Reader read = new InputStreamReader(finput);
        char fdata[] = new char[1024];
        int length = read.read(fdata);
        finput.close();
        read.close();
        System.out.println("读取的数据为：【"+new String(fdata,0,length)+"】");
    }
}
