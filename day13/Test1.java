package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 演示程序中的异常。
 * @author administrator
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");
        try {
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
        }catch (ArithmeticException e){
            System.err.println("输入必须为整数");
            //打印异常堆栈信息
            e.printStackTrace();
            //退出java虚拟机
          //  System.exit(1);
            return;
        }catch (InputMismatchException e){
            System.err.println("除数不能为零");
            e.printStackTrace();
        }catch (Exception e){
            System.err.println("出现了其他错误");
            e.printStackTrace();
        }
        finally {
            System.out.println("感谢使用本程序！");
        }

    }
}
