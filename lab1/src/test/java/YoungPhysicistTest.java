import org.junit.Test;

import static org.junit.Assert.*;

public class YoungPhysicistTest {

    @Test
    public void TestCreateVectors() {
        int[] testCases = {1,100, -5, 104, 8,3,50};
        YoungPhysicist youngPhysicist = new YoungPhysicist();
        for(int i = 0; i<7; i++){
            if(testCases[i]<1 || testCases[i]>100){
                assertNull(youngPhysicist.createVectors(testCases[i]));
            }else{
                int [][] vectors = youngPhysicist.createVectors(testCases[i]);
                assertEquals(testCases[i], vectors.length);
                assertEquals(3, vectors[0].length);
            }
        }
    }

    @Test
    public void TestIsIdle() {
        int[][] testVectors =  {
                {3, -1, 7},
                {-5, 2, -4},
                {2, -1, -3}
        };
        YoungPhysicist youngPhysicist = new YoungPhysicist();
        for(int n = 1; n<=100; n++){
            int [][] vectors = youngPhysicist.createVectors(n);
            for(int rows = 0; rows<n; rows++){
                System.arraycopy(testVectors[rows % 3], 0, vectors[rows], 0, 3);
            }
            if(n%3 == 0){
                assertTrue(youngPhysicist.isIdle(n, vectors));
            }else{
                assertFalse(youngPhysicist.isIdle(n, vectors));
            }
        }
    }
}