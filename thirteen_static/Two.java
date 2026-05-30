package thirteen_static;

public class Two {
    
    // static variable
    public static String staticData;

    //instance variable 
    public String instanceData;

    // static block - 1st Execution
    static {
        System.out.println("Static Block Executed");
        staticData = "Static Data Initialized";
    }

    // instance block - 3rd Execution
    {
        System.out.println("Instance Block Executed");
        instanceData = "Instance Data Initialized In instance block not in constructor";
        System.out.println(instanceData);
    }

    // constructor - 4th Execution
    public Two() {
        System.out.println("Constructor Executed");
    }

    // Instance Method
    public void instanceMethod() {
        System.out.println("Instance Method Executed");
    }

    // Static Method
    public static void staticMethod() {
        System.out.println("Static Method Executed");
    }

    // static method - 2nd Execution
    public static void main(String[] args) {
        System.out.println("Main Static Method Executed");
        Two object = new Two(); 
        System.out.println(("For Confirmation: "+object.instanceData));

        // calling order is imp
        
        // calling static method
        Two.staticMethod(); // Recommended
        // object.staticMethod(); // Not Recommended
        // System.out.println(Two.staticData);

        // calling instance method 
        object.instanceMethod();


    }

}
