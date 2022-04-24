package Loopweek;

public class DoWhileLoopTable {
    public static void main(String[] args) {
        int x=1, m=8;
        // create a programme for times table using do while loop and concatenation
        do{
            System.out.println(x+"x"+m+"="+m*x);
            x++;
        }while(x<=10);
    }
}
