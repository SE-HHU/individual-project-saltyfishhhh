import java.util.ArrayList;

public class Library3 {
    public ArrayList<Problem_3> library3 = new ArrayList<>();//用来盛放符合要求的两符号算式
    //isExist函数用于判断该算式是否重复
    public boolean isExist2(Problem_3 problem3){
        for(int i = 0;i<this.library3.size();i++){
            if(this.library3.get(i).equals(problem3)){
                return true;
            }
            return false;
        }
        return false;
    }
    //isPositive用于判断结果是否为正及是否在100以内
    public boolean isPositive(Problem_3 problem3){
        if(problem3.answer>=0){
            if(problem3.answer<=100){
                return true;
            }
        }
        return false;
    }

}
