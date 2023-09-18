

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberTest {
    private int[] missingMax = {1,2,3,4,5,6,7,8,9};
    private int[] missingNone = {1,2,3,4,5,6,7,8,9,10};
    private int[] missingSix = {1,2,3,4,5,7,8,9,10};
    private int[] missingMin = {2,3,4,5,6,7,8,9,10};
    private MissingNumber missNum = new MissingNumber();

    @Test
    public void testMissingNumber_MissingMax(){
        Assert.assertEquals(10, missNum.missingNumber(missingMax, 10));
    }

    @Test
    public void testMissingNumber_MissingNone(){
        Assert.assertEquals(0,missNum.missingNumber(missingNone,10));
    }

    @Test
    public void testMissingNumber_MissingSix(){
        Assert.assertEquals(6, missNum.missingNumber(missingSix,10));
    }
    @Test
    public void testMissingNumber_MissingMin(){
        Assert.assertEquals(1, missNum.missingNumber(missingMin, 10));
    }
}