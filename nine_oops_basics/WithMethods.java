package nine_oops_basics;

public class WithMethods {

    int userOnenumOne;
    int userOnenumTwo;

    // Math Operations 
    public void mathsOps() {
        System.out.println(userOnenumOne + userOnenumTwo);
        System.out.println(userOnenumOne - userOnenumTwo);
        System.out.println(userOnenumOne * userOnenumTwo);
        System.out.println(userOnenumOne / userOnenumTwo);    
    }
    
    public static void main(String[] args) {
        
        WithMethods object = new WithMethods();
        
        object.userOnenumOne = 10;
        object.userOnenumTwo = 5;
        object.mathsOps();
        System.out.println("=========================");
        // Second User wants to calculate for 20 & 5
        object.userOnenumOne = 20;
        object.userOnenumTwo = 5;
        object.mathsOps();
        System.out.println("=========================");
        // Second User wants to calculate for 20 & 5
        object.userOnenumOne = 200;
        object.userOnenumTwo = 50;
        object.mathsOps();
        System.out.println("=========================");

    }

}
