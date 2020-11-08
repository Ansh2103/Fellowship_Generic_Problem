import java.util.Arrays;

public class Maximum <T extends  Comparable<T>> {

    private T arrayOfValues[];

    public Maximum(T[] arrayOfValues) {
        this.arrayOfValues = arrayOfValues;
    }

    public T maxValueBWThree() {
        Arrays.sort(arrayOfValues);

        Arrays.stream(arrayOfValues).forEach(System.out :: println );
        return arrayOfValues[arrayOfValues.length - 1];
    }

}