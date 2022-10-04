public class Problem_2 {
    //这个类表示一个符号的算式
    protected int n1;
    protected int n2;
    protected int c1;
    protected int answer;

    public int getAnswer(){
        return this.answer;
    }
    public Problem_2(){
        this.n1 = 0;
        this.n2 = 0;
        this.c1 = 0;
        this.answer = 0;
    }
    public Problem_2(int n1, int n2, int c1){
        this.n1 = n1;
        this.n2 = n2;
        this.c1 = c1;
        if(c1 == 1){
            this.answer = this.n1+this.n2;
        }
        else{
            this.answer = this.n1-this.n2;
        }
    }
    //重写判断语句，依次判断结果、符号及各项是否相等来判断是否相等
    @Override
    public boolean equals(Object obj) {
        Problem_2 problem = new Problem_2();
        if (obj instanceof Problem_2) {
            problem = (Problem_2) obj;
        }
        if (this.answer == problem.answer){
            if(this.c1 == problem.c1)
                if(this.n1==problem.n1||this.n1== problem.n2){
                    return true;
                }
        }
        return false;
    }
    public String toString(){
        if(this.c1 == 1){
            return n1+"+"+n2+"=";
        }
        else{
            return n1+"-"+n2+"=";
        }
    }
}
