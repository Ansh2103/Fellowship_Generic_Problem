import java.util.Arrays;

public class Maximum <T extends  Comparable<T>> {

    private T arrayOfValues[];

    public Maximum(T[] arrayOfValues) {
        this.arrayOfValues = arrayOfValues;
    }

    public T maxValueBWThree() {
        Arrays.sort(arrayOfValues);
        T max = arrayOfValues[arrayOfValues.length - 1];
        printResult(arrayOfValues , max);
        return max ;
    }

    public void printResult(T array[], T max){
      Arrays.stream(array).forEach(System.out ::println);
        System.out.println("Maximum Value of an array is" +max );
    }
}