package tweleve_strings;

public class ThreeComparision {
    
    public static void main(String[] args) {


        // Immutability with Strings
        String str = "hell";
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str.concat("o")));
        System.out.println(System.identityHashCode(str));
        System.out.println(str);
        System.out.println("====================");

        // Immutability with StringBuilder
        StringBuilder strBuilder = new StringBuilder("hell");
        System.out.println(System.identityHashCode(strBuilder));
        System.out.println(System.identityHashCode(strBuilder.append("o")));
        System.out.println(System.identityHashCode(strBuilder));
        System.out.println(strBuilder);
        System.out.println("====================");
        // Confirmed - StringBuilder is Mutable

        // Immutability with StringBuffer
        StringBuffer strBuffer = new StringBuffer("hell");
        System.out.println(System.identityHashCode(strBuffer));
        System.out.println(System.identityHashCode(strBuffer.append("o")));
        System.out.println(System.identityHashCode(strBuffer));
        System.out.println(strBuffer);
        System.out.println("====================");
        // Confirmed - StringBuffer is Mutable


        // Strings vs StringBuilder vs StringBuffer 

        // String
        long startTimeString = System.currentTimeMillis();

        String strObj = "Good";

        for (int i = 0; i < 100000000; i++) {
            strObj.concat("Morning");
        }

        long endTimeString = System.currentTimeMillis();

        System.out.println("Time Taken By Strings: "+(endTimeString-startTimeString));
        System.out.println("====================");

        // StringBuilder - Fastest
        long startTimeStringBuilder = System.currentTimeMillis();

        StringBuilder stringBuilderObj = new StringBuilder("Good");

        for (int i = 0; i < 100000000; i++) {
            stringBuilderObj.append("Morning");
        }

        long endTimeStringBuilder = System.currentTimeMillis();

        System.out.println("Time Taken By String Builder: "+(endTimeStringBuilder-startTimeStringBuilder));
        System.out.println("====================");

        // StringBuffer - Slower
        long startTimeStringBuffer = System.currentTimeMillis();

        StringBuffer stringBufferObj = new StringBuffer("Good");

        for (int i = 0; i < 100000000; i++) {
            stringBufferObj.append("Morning");
        }

        long endTimeStringBuffer = System.currentTimeMillis();

        System.out.println("Time Taken By String Buffer: "+(endTimeStringBuffer-startTimeStringBuffer));
        System.out.println("====================");


    }

}
