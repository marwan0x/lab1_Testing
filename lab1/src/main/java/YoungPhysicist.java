import java.util.Scanner;

public class YoungPhysicist {


    public static void main(String [] args){


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][] vectors = createVectors(n);
        assert vectors != null;


        for(int rows = 0; rows<n; rows++){
            for(int cols = 0; cols< 3; cols++){
                vectors[rows][cols] = input.nextInt();
            }
        }
        if(isIdle(n, vectors)){
            System.out.println("YES");
        }else{
            System.out.println("NO");

        }

    }



    public static int[][] createVectors(int n) {
        if (n < 1 || n > 100) {
            return null;
        }

        return new int[n][3];
    }

    public static boolean isIdle(int n, int[][] vectors) {

        for (int cols = 0; cols < 3; cols++) {
            int sum = 0;
            for (int rows = 0; rows < n; rows++) {
                sum += vectors[rows][cols];
            }
            if (sum != 0) {
                return false;
            }
        }
        return true;
    }

}
