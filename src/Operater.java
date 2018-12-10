import java.io.*;
import java.util.ArrayList;

/*
主要的文件操作类
在初始化的时候把文件里的内容一行一行的读入，经处理后将每一行解析为一个member对象
每一个member对象都具有学号，姓名，训练次数三个属性
初始化结束之后，调用一个Input类的引用，用来读入输入的学号；读入学号之后，检索memberlist里面的的每一个member对象
如果匹配的话，就让它的"训练次数"加一
在程序结束的时候，将memberlist里面的数据全部打印到原来的文件里面
 */
public class Operater {
    public ArrayList<member> memberArrayList = new ArrayList<>();
    public String currentGrade;
    public String getCurrentGrade(){
        return this.currentGrade;
    }
    public Operater(String string){
        this.currentGrade = string;
    }

    public void setinlines() throws IOException {
        File currentfile = new File(getCurrentGrade());
        if (currentfile.exists()){
            BufferedReader bufferedReader = new BufferedReader(new FileReader(getCurrentGrade()));
            do {
                String temp = bufferedReader.readLine();
                if (temp != null){
                    member m = new member(temp);
                    memberArrayList.add(m);
                }
                else break;
            }while (true);
            return;
        }else {
            System.out.println("所要操作的文件不存在哦~请确认当前文件并重新运行程序");
            System.exit(0);
        }
    }


    public void comingTraining(String xuehao){
        for (member x : memberArrayList){
            if (xuehao.equals(x.getNumber())){
                x.addtrainingtimes();
            }
        }
    }


    public void finishing() throws IOException {
        FileWriter fileWriter = new FileWriter(getCurrentGrade(),false);
        for (member x:memberArrayList){
            System.out.println("要写入的是"+x.getNumber()+" "+x.getName()+" "+x.getTrainingtimes()+"\n");
            fileWriter.write(x.getNumber()+" "+x.getName()+" "+x.getTrainingtimes()+"\n");
            fileWriter.flush();
        }
    }
}
