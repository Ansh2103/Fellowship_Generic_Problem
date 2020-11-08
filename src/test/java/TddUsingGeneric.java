import org.junit.Assert;
import org.junit.Test;

public class TddUsingGeneric {

    @Test
    public void First_Result_Should_Return_First_Maximum(){
        Integer array[] = {9,3,5,7,1};
        Maximum maximum = new Maximum(array);
        Comparable max = maximum.maxValueBWThree();
        Assert.assertEquals(9,max);
    }

    @Test
    public void First_Result_Should_Not_Return_First_Maximum(){
        Integer array[] = {9,3,5,7,1};
        Maximum maximum = new Maximum(array);
        Comparable max = maximum.maxValueBWThree();
        Assert.assertNotEquals(3,max);
    }

    @Test
    public void Second_Result_Should_Return_Second_Maximum(){
        Integer array[] = {9,10,5,7,1};
        Maximum maximum = new Maximum(array);
        Comparable max = maximum.maxValueBWThree();
        Assert.assertEquals(10,max);
    }

    @Test
    public void Third_Result_Should_Return_Third_Maximum(){
        Integer array[] = {9,3,10,7,1};
        Maximum maximum = new Maximum(array);
        Comparable max = maximum.maxValueBWThree();
        Assert.assertEquals(10,max);
    }
    @Test
    public void FirstFloatValueShouldReturnFirstValueAsMaximum() {
        Float array[] = {33.3f, 27.7f, 7.7f};
        Maximum maximum = new Maximum(array);
        Comparable max = maximum.maxValueBWThree();
        Assert.assertEquals(33.3f, max);
    }

    @Test
    public void FirstFloatValueShouldNotReturnFirstValueAsMaximum() {
        Float array[] = {33.3f, 27.7f, 7.7f};
        Maximum maximum = new Maximum(array);
        Comparable max = maximum.maxValueBWThree();
        Assert.assertNotEquals(27.7f, max);
    }

    @Test
    public void SecondFloatValueShouldReturnSecondValueAsMaximum() {
        Float array[] = {27.7f,33.3f , 7.7f};
        Maximum maximum = new Maximum(array);
        Comparable max = maximum.maxValueBWThree();
        Assert.assertEquals(33.3f, max);
    }

    @Test
    public void ThirdFloatValueShouldReturnThirdValueAsMaximum() {
        Float array[] = {17.3f, 7.3f, 33.3f};
        Maximum maximum = new Maximum(array);
        Comparable max = maximum.maxValueBWThree();
        Assert.assertEquals(33.3f, max);
    }

    @Test
    public void FirstStringValueShouldReturnFirstStringAsMaximumValue(){
        String array[] = {"Orange","Aple","Guava"};
        Maximum maximum = new Maximum(array);
        Comparable max = maximum.maxValueBWThree();
        Assert.assertEquals("Orange", max);
    }

    @Test
    public void FirstStringValueShouldNotReturnFirstStringAsMaximumValue(){
        String array[] = {"Orange","Aple","Guava"};
        Maximum maximum = new Maximum(array);
        Comparable max = maximum.maxValueBWThree();
        Assert.assertNotEquals("Guava", max);
    }

    @Test
    public void SecondStringValueShouldReturnSecondStringAsMaximumValue(){
        String array[] = {"Grapes","Pomegranete","Papaya"};
        Maximum maximum = new Maximum(array);
        Comparable max = maximum.maxValueBWThree();
        Assert.assertEquals("Pomegranete", max);
    }

    @Test
    public void ThirdStringValueShouldReturnThirdStringAsMaximumValue(){
        String array[] = {"Apple","Orange","Pomegranete"};
        Maximum maximum = new Maximum(array);
        Comparable max = maximum.maxValueBWThree();
        Assert.assertEquals("Pomegranete", max);
    }
}
