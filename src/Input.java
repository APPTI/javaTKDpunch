import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public String readnumber() throws IOException {
        String temp = bufferedReader.readLine();
        if (temp != null){
            return temp;
        }
        else System.out.println("输入结束，以上为本次训练的全部人员");
        return null;
    }

    public String readsingleline() throws IOException {
        return bufferedReader.readLine();
    }
}
