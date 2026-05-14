package nine_oops_basics;

public class WithMethodParams {


    // With Return 
    public String greet(){
        return "Hello";
    }

    // Math Operations 
    public void mathsOps(int num1, int num2) {
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);    
    }
    
    public static void main(String[] args) {
        
        WithMethodParams object = new WithMethodParams();
        System.out.println(object.greet());
        object.mathsOps(10,5);
        System.out.println("=========================");
        // Second User wants to calculate for 20 & 5
        System.out.println(object.greet());
        object.mathsOps(20,5);
        System.out.println("=========================");
        // Second User wants to calculate for 200 & 50
        System.out.println(object.greet());
        object.mathsOps(200,50);
        System.out.println("=========================");

    }

}
