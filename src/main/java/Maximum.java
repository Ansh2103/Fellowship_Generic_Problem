public class Maximum {
    public int findMax(Integer fValue, Integer sValue, Integer tValue) {

        Integer max = fValue;

        if(sValue.compareTo(max) > 0)
        {
            max = sValue;
        }
        if(tValue.compareTo(max) >0)
        {
            max = tValue;
        }
        return max;
    }
    public Float findMax(Float fValue, Float sValue, Float tValue) {

        Float max = fValue;

        if(sValue.compareTo(max) > 0)
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