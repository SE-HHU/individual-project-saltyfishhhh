public class Problem_3 {
    //这个类表示两个符号的算式
    protected int n1;
    protected int n2;
    protected int n3;
    protected int c1;
    protected int c2;
    protected int answer;

    public Problem_3(){
        this.n1 = 0;
        this.n2 = 0;
        this.n3 = 0;
        this.c1 = 0;
        this.c2 = 0;
        this.answer = 0;
    }
    public Problem_3(int n1, int n2, int n3, int c1, int c2){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.c1 = c1;
        this.c2 = c2;
        if(c1 == 1){
            this.answer = this.n1+this.n2;
            if(c2 == 1){
                this.answer += this.n3;
            }
            else{
                this.answer -= this.n3;
            }
        }
        else{
            this.answer = this.n1-this.n2;
            if(c2 == 1){
                this.answer += this.n3;
            }
            else{
                this.answer -= this.n3;
            }
        }


    }
    public int getAnswer(){
        return this.answer;
    }
    @Override
    public boolean equals(Object obj){
        Problem_3 problem = new Problem_3();
        if(obj instanceof Problem_3){
            problem = (Problem_3) obj;
        }
        if(this.answer == problem.answer){
            if((this.c1==problem.c1&&this.c2== problem.c2)||(this.c1==problem.c2&&this.c2== problem.c1)){
                return true;//开摆了，不知道怎么看一模一样，答案相同符号相同就算
            }
        }
        return false;
    }
    public String toString(){
        if(this.c1 == 1){
            if(this.c2 == 1){
                return n1+"+"+n2+"+"+n3+"=";
            }
            else{
                return n1+"+"+n2+"-"+n3+"=";
            }
        }
        else{
            if(this.c2 == 1){
                return n1+"-"+n2+"+"+n3+"=";
            }
            else{
                return n1+"-"+n2+"-"+n3+"=";
            }
        }
    }
}
