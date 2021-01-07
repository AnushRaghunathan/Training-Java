public class Main {
    public static void main(String[] args){

        /* int intValue = 10; */
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer value - min: "+intMinValue+" max: "+intMaxValue);

        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte value - min: "+byteMinValue+" max: "+byteMaxValue);

        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("Short value - min: "+shortMinValue+" max: "+shortMaxValue);

        // L is required for long
        /* long longValue = 10L; */
        /* long longValue = 2147483649L; */
        long longMinValue = Long.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;
        System.out.println("Long value - min: "+longMinValue+" max: "+longMaxValue);

        //Casting
        int intNewValue = (intMinValue / 2);
        byte byteNewValue = (byte) (byteMinValue / 2);
        short shortNewValue = (short) (shortMinValue / 2);
    }
}
