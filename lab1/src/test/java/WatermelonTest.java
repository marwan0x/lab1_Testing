import org.junit.Assert;
import org.junit.Test;

public class WatermelonTest {
@Test
    public void testIsEven() {
        int [] testCases = {-3,120,1,100, 5,2,19 };
        Watermelon watermelon = new Watermelon();
        for(int i = 0; i<7; i++){
            int actual = watermelon.isEven(testCases[i]);
            if(testCases[i]<1 || testCases[i]>100){
                Assert.assertEquals(-1, actual);
            }else{
                int result = -1;
                if(testCases[i]%2 == 0 && testCases[i]>2){
                    result = 1;
                }else {
                    result = 0;
                }
                Assert.assertEquals(result, actual);
            }
        }
    }
}