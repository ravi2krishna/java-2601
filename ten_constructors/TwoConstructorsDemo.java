package ten_constructors;

public class TwoConstructorsDemo {
    
    // Instance Variables 
    int number;
    float floatNumber;
    double decimalNumber;
    String textData;
    char characterData;

    // Constructors can be used to initialize the object the way you want 
    public TwoConstructorsDemo(){
       System.out.println("Setting User Defined Values, When Objects Get Initialized"); 
       number = 10;
       floatNumber = 3.14f;
       decimalNumber = 3.14159265359;
       textData = "Hello";
       characterData = '$';
    }


    public static void main(String[] args) {

        TwoConstructorsDemo obj = new TwoConstructorsDemo();
       
        System.out.println("Number is "+obj.number);
        System.out.println("Float Number is "+obj.floatNumber);
        System.out.println("Decimal Number is "+obj.decimalNumber);
        System.out.println("Text Data "+obj.textData);
        System.out.println("Character Data "+obj.characterData);

    }

}
