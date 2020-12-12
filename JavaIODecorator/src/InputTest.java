import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//测试程序 - 还是不支持中文输出啊(换个编码？
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in =
                //第一个装饰者
                new LowerCaseInputStream(
                    //第二个装饰者
                    new BufferedInputStream(
                            //内部的被装饰者
                            new FileInputStream("test.txt")
                    )
                );

            while((c = in.read()) > 0) {
                System.out.println((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
