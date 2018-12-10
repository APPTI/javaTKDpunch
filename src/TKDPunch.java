import java.io.IOException;
import java.util.Scanner;

/*
程序的入口
 */
public class TKDPunch {
    public static void main(String args[]) throws IOException {
        Input i = new Input();
        System.out.println("请输入当前需要操作的文件");
        String gread = i.readsingleline();
        System.out.println("操作完毕，接下来请按行输入本次前来训练的学员的学号");
        Operater operater = new Operater(gread);
        operater.setinlines();
        Scanner scanner = new Scanner(System.in);
        do {
            String temp = scanner.nextLine();
            if (temp != null && temp.equals("q") ==false) {
                operater.comingTraining(temp);
            }
            else break;
        }while (true);
        System.out.println("输入完毕，下面开始重新初始化文件");
        operater.finishing();
    }
}
