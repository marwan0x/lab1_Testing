import java.util.Scanner;

public class Watermelon {
    /*Basically, we need to check if a given number "w"; 1<=w<=100,
    * can be defined as a sum of two even numbers.
    * this is only possible, if and only if, w is even and bigger than 2.*/
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        if(isEven(w) == 1){
            System.out.println("YES");
        }else if(isEven(w)==0){
            System.out.println("NO");
        }else{
            System.out.println("Wrong input");
        }

    }
    public static int isEven(int w){
        if(w < 1 || w > 100){
            return -1;
        }
        if( w%2 == 0 && w>2) {
            return 1;
        }
        return 0;
    }

}
