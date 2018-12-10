public class member {
    //学号属性
    private String number ;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    //姓名属性
    private String name ;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //训练次数属性，初始化的时候默认为0
    private int trainingtimes = 0;

    public void setTrainingtimes(int i){
        this.trainingtimes = i;

    }
    public int getTrainingtimes() {
        return trainingtimes;
    }

    //来训练的，增加训练次数
    public void addtrainingtimes(){
        this.trainingtimes++;
    }
    //构造方法，初始化学生的姓名和学号属性
    public member(String str){
        String temp[] = str.split(" ");
        if (temp.length == 2){
            this.setNumber(temp[0]);
            this.setName(temp[1]);
            this.trainingtimes = 0;
        }
        else if (temp.length == 3){
            this.setNumber(temp[0]);
            this.setName(temp[1]);
            this.setTrainingtimes(Integer.parseInt(temp[2]));
        }
        else System.out.println(str+"这一行出现了解析错误");
    }
}
