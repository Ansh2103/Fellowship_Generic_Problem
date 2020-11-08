public class Maximum {

    public static  <T extends Comparable<T>> T findMax( T fValue,T sValue ,T tValue) {
        T max = fValue;
        if(sValue.compareTo(max) > 0 )
        {
            max = sValue;
        }
        if(tValue.compareTo(max) >0)
        {
            max = tValue;
        }
        return max;
    }

}