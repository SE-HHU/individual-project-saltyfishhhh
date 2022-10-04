import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入算式数量");
        int num = in.nextInt();//读取算式数量
        Library2 library2 = new Library2();
        Library3 library3 = new Library3();
        Random r = new Random();
        //默认对算式进行均分，一半一符号，一半两符号
        for(int i =0;i<num/2;i++){
            Problem_2 p2;
            do{
                p2 = new Problem_2(r.nextInt(101),r.nextInt(101), r.nextInt(2));
            }
            while(library2.isExist2(p2)||(!library2.isPositive(p2)));
            library2.library2.add(p2);
        }
        for(int i =num/2;i<=num;i++){
            Problem_3 p3;
            do{
                p3 = new Problem_3(r.nextInt(101),r.nextInt(101),r.nextInt(101),
                        r.nextInt(2),r.nextInt(2));
            }
            while(library3.isExist2(p3)||(!library3.isPositive(p3)));
            library3.library3.add(p3);
        }
        try {
            FileWriter myWriter = new FileWriter("Exercise.txt");
            for(int i = 0;i<library2.library2.size();i++){
                myWriter.write((i+1)+". "+library2.library2.get(i).toString()+"\n");
                }
            for(int i = 0;i<library3.library3.size();i++){
                myWriter.write((i+library2.library2.size())+". "+library3.library3.get(i).toString()+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("Answer.txt");
            for(int i = 0;i<library2.library2.size();i++){
                myWriter.write((i+1)+". "+library2.library2.get(i).answer+"\n");
            }
            for(int i = 0;i<library3.library3.size();i++){
                myWriter.write((i+library2.library2.size())+". "+library3.library3.get(i).answer+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
