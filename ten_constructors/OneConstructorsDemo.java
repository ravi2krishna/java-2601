package ten_constructors;

public class OneConstructorsDemo {
    
    // Instance Variables 
    int number;
    float floatNumber;
    double decimalNumber;
    String textData;
    char characterData;


    public static void main(String[] args) {

        OneConstructorsDemo obj = new OneConstructorsDemo();
       
        System.out.println("Number is "+obj.number);
        System.out.println("Float Number is "+obj.floatNumber);
        System.out.println("Decimal Number is "+obj.decimalNumber);
        System.out.println("Text Data "+obj.textData);
        System.out.println("Character Data "+obj.characterData);

    }

}
