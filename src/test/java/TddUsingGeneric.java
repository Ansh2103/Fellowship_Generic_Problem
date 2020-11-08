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
    @Test
    public void FirstFloatValueShouldReturnFirstValueAsMaximum() {
        Maximum maximum = new Maximum();
        float max = maximum.findMax(33.3f, 27.7f, 7.7f);
        Assert.assertEquals(33.3f, max, 0.00003);
    }

    @Test
    public void FirstFloatValueShouldNotReturnFirstValueAsMaximum() {
        Maximum maximum = new Maximum();
        float max = maximum.findMax(33.3f, 27.7f, 7.7f);
        Assert.assertNotEquals(27.7f, max, 0.00003);
    }

    @Test
    public void SecondFloatValueShouldReturnSecondValueAsMaximum() {
        Maximum maximum = new Maximum();
        float max = maximum.findMax(27.7f, 33.3f, 23.3f);
        Assert.assertEquals(33.3f, max, 0.00003);
    }

    @Test
    public void ThirdFloatValueShouldReturnThirdValueAsMaximum() {
        Maximum maximum = new Maximum();
        float max = maximum.findMax(17.3f, 7.3f, 33.3f);
        Assert.assertEquals(33.3f, max, 0.00003);
    }

    @Test
    public void FirstStringValueShouldReturnFirstStringAsMaximumValue(){
        Maximum maximum = new Maximum();
        String max = maximum.findMax("Orange","Aple","Guava");
        Assert.assertEquals("Orange", max);
    }

    @Test
    public void FirstStringValueShouldNotReturnFirstStringAsMaximumValue(){
        Maximum maximum = new Maximum();
        String max = maximum.findMax("Orange","Aple","Guava");
        Assert.assertNotEquals("Guava", max);
    }

    @Test
    public void SecondStringValueShouldReturnSecondStringAsMaximumValue(){
        Maximum maximum = new Maximum();
        String max = maximum.findMax("Grapes","Pomegranete","Papaya");
        Assert.assertEquals("Pomegranete", max);
    }

    @Test
    public void ThirdStringValueShouldReturnThirdStringAsMaximumValue(){
        Maximum maximum = new Maximum();
        String max = maximum.findMax("Apple","Orange","Pomegranete");
        Assert.assertEquals("Pomegranete", max);
    }
}
