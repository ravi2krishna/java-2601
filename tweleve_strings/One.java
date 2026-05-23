package tweleve_strings;

public class One {
    
    public static void main(String[] args) {
        
        // primitive type
        int i = 10;

        // string type 
        String name = "Ravi";

        // Behavior 
        System.out.println(i); // normal expected Behavior
        System.out.println(name); // normal expected Behavior

        // creating object for class One
        One o1 = new One();
        System.out.println(o1); // object address 

        String s1 = new String();
        System.out.println(s1); // empty string - empty character sequence

        // String Memory Pool 
        String c1 = "Cat";
        String c2 = "Cat";

        // check object memory 
        System.out.println(System.identityHashCode(c1));
        System.out.println(System.identityHashCode(c2));

        String c3 = "cat";
        System.out.println(System.identityHashCode(c3));

        System.out.println("==================");

        // With Above approach we can confirm, 
        // when strings are created without new keyword, 
        // strings objects are created in string pool, where same content objects 
        // will be referenced, not created again

        // When we use new keyword, when creating string objects, 
        // always new memory block will be created 

        String cs1 = new String("Cat");
        String cs2 = new String("Cat");
        // check object memory 
        System.out.println(System.identityHashCode(cs1));
        System.out.println(System.identityHashCode(cs2));

        // == with primitives, we compare values 
        // == with strings, we compare memory address
        // equals() with strings, we compare string contents 

        System.out.println(c1 == c2); // memory address comparison
        System.out.println(c1 == c3); // memory address comparison

        System.out.println("==================");

        System.out.println(c1.equals(c2)); // string contents comparison
        System.out.println(c1.equals(c3)); // string contents comparison
        String c4 = "cat";
        System.out.println(c3.equals(c4)); // string contents comparison

        System.out.println(c1.equals(cs1)); // string contents comparison

        // Strings are immutable in nature
        String greet = "hello"; // change this to Hello 
        System.out.println(greet);

        // access first character
        System.out.println(greet.charAt(0));
        // greet.charAt(0) = 'H';

        String str = "hell";
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str.concat("o")));
        System.out.println(System.identityHashCode(str));
        System.out.println(str);



    }

}
