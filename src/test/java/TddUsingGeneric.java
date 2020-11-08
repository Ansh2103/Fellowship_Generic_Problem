import org.junit.Assert;
import org.junit.Test;

public class TddUsingGeneric {

    @Test
    public void First_Result_Should_Return_First_Maximum(){
        Maximum maximum = new Maximum();
        int max = maximum.findMax(7,3,2);
        Assert.assertEquals(7,max);
    }

    @Test
    public void First_Result_Should_Not_Return_First_Maximum(){
        Maximum maximum = new Maximum();
        int max = maximum.findMax(7,3,2);
        Assert.assertNotEquals(3,max);
    }

    @Test
    public void Second_Result_Should_Return_Second_Maximum(){
        Maximum maximum = new Maximum();
        int max = maximum.findMax(7,8,2);
        Assert.assertEquals(8,max);
    }

    @Test
    public void Third_Result_Should_Return_Third_Maximum(){
        Maximum maximum = new Maximum();
        int max = maximum.findMax(7,8,10);
        Assert.assertEquals(10,max);
    }
}
