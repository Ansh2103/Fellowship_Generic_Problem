import org.junit.Assert;
import org.junit.Test;

public class TddUsingGeneric {

    @Test
    public void First_Result_Should_Return_First_Maximum(){
        Maximum maximum = new Maximum(7,3,2);
        Comparable max = maximum.findMax();
        Assert.assertEquals(7,max);
    }

    @Test
    public void First_Result_Should_Not_Return_First_Maximum(){
        Maximum maximum = new Maximum(7,3,2);
        Comparable max = maximum.findMax();
        Assert.assertNotEquals(3,max);
    }

    @Test
    public void Second_Result_Should_Return_Second_Maximum(){
        Maximum maximum = new Maximum(7,8,2);
        Comparable max = maximum.findMax();
        Assert.assertEquals(8,max);
    }

    @Test
    public void Third_Result_Should_Return_Third_Maximum(){
        Maximum maximum = new Maximum(7,8,10);
        Comparable max = maximum.findMax();
        Assert.assertEquals(10,max);
    }
    @Test
    public void FirstFloatValueShouldReturnFirstValueAsMaximum() {
        Maximum maximum = new Maximum(33.3f, 27.7f, 7.7f);
        Comparable max = maximum.findMax();
        Assert.assertEquals(33.3f, max);
    }

    @Test
    public void FirstFloatValueShouldNotReturnFirstValueAsMaximum() {
        Maximum maximum = new Maximum(33.3f, 27.7f, 7.7f);
        Comparable max = maximum.findMax();
        Assert.assertNotEquals(27.7f, max);
    }

    @Test
    public void SecondFloatValueShouldReturnSecondValueAsMaximum() {
        Maximum maximum = new Maximum(27.7f, 33.3f, 23.3f);
        Comparable max = maximum.findMax();
        Assert.assertEquals(33.3f, max);
    }

    @Test
    public void ThirdFloatValueShouldReturnThirdValueAsMaximum() {
        Maximum maximum = new Maximum(17.3f, 7.3f, 33.3f);
        Comparable max = maximum.findMax();
        Assert.assertEquals(33.3f, max);
    }

    @Test
    public void FirstStringValueShouldReturnFirstStringAsMaximumValue(){
        Maximum maximum = new Maximum("Orange","Aple","Guava");
        Comparable max = maximum.findMax();
        Assert.assertEquals("Orange", max);
    }

    @Test
    public void FirstStringValueShouldNotReturnFirstStringAsMaximumValue(){
        Maximum maximum = new Maximum("Orange","Aple","Guava");
        Comparable max = maximum.findMax();
        Assert.assertNotEquals("Guava", max);
    }

    @Test
    public void SecondStringValueShouldReturnSecondStringAsMaximumValue(){
        Maximum maximum = new Maximum("Grapes","Pomegranete","Papaya");
        Comparable max = maximum.findMax();
        Assert.assertEquals("Pomegranete", max);
    }

    @Test
    public void ThirdStringValueShouldReturnThirdStringAsMaximumValue(){
        Maximum maximum = new Maximum("Apple","Orange","Pomegranete");
        Comparable max = maximum.findMax();
        Assert.assertEquals("Pomegranete", max);
    }
}
