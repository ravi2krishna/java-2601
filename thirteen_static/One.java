package thirteen_static;

public class One {
    
    // static variable
    public static String staticData;

    //instance variable 
    public String instanceData;

    // static block - 1st Execution
    static {
        System.out.println("Static Block Executed");
        staticData = "Static Data Initialized";
    }

    // instance block
    {
        System.out.println("Instance Block Executed");
    }

    public One() {
        System.out.println("Constructor Executed");
    }

    public void instanceMethod() {
        System.out.println("Instance Method Executed");
    }

    // static method - 2nd Execution
    public static void main(String[] args) {
        System.out.println("Main Static Method Executed");
    }

}
