import java.util.ArrayList;

public class Library2 {
    protected ArrayList<Problem_2> library2 = new ArrayList<>();//用来盛放符合要求的一符号算式
    //isExist函数用于判断该算式是否重复
    public boolean isExist2(Problem_2 problem2){
        for(int i = 0;i<this.library2.size();i++){
            if(this.library2.get(i).equals(problem2)){
                return true;
            }
            return false;
        }
        return false;
    }
    //isPositive用于判断结果是否为正及是否在100以内
    public boolean isPositive(Problem_2 problem2){
        if(problem2.answer>=0){
            if(problem2.answer<=100)
                return true;
        }
        return false;
    }
}
