package Loopweek;

public class ForLoopOddEven {
    public static void main(String[] args) {

       // create odd number using for loop 1-21
        for (int i = 0; i <21; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        // create even number using for loop 1-22
        for(int i=0; i<22; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }

}








