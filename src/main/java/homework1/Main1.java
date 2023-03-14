package homework1;

public class Main1 {
    public static void main(String[] args) {
     long longValue = 50;
     int intValue = 29;
     byte byteValue = 89;
     short shortValue = 130;
     float floatValue = 189.98f;
     double doubleValue = 348.98;
     int result1 = byteValue + shortValue;
     long result2 =  intValue + longValue;
     double result3 = floatValue + doubleValue;
     double result4 = intValue + doubleValue;

    sumOfintlong(intValue, longValue);
    sumOfbyteshort(byteValue, shortValue);
    sumOffloutdouble(floatValue, doubleValue);
    sumOfintlong(intValue,longValue);

    }
    public static void sumOfbyteshort (byte byteValue, short shortValue) {
     System.out.println(byteValue + shortValue);
    }
    public static void sumOfintlong (int intValue, long longValue) {
     System.out.println(intValue + longValue);
    }
    public static void sumOffloutdouble (float floutValue, double doubleValue) {
     System.out.println(floutValue + doubleValue);
    }
    public static void sumOfintdouble (int intValue, double doubleValue) {
     System.out.println(intValue + doubleValue);
    }

}
