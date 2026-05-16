package nine_oops_basics;

public class VariableTypes {

    // Instance Variable 
    String employeeName;
    int employeeAge;
    
    // Method
    public void showEmployeeInfo() {
        // Local Variable
        
        // without initialization
        // int employeeSalary;
        // // local variable employeeSalary may not have been initialized
        // System.out.println("Employee Salary: "+employeeSalary); 

        int employeeSalary=250000;
        System.out.println("Employee Salary: "+employeeSalary); 

        // can i access instance variables in methods 
        System.out.println("Employee Name In Method: "+employeeName);

        System.out.println("Company Name: "+companyName);

    }

    // Static Variable 
    static String companyName;
    static String companyNames = "TCS";
    
    public static void main(String[] args) {
        
        VariableTypes obj = new VariableTypes();
        System.out.println("Instance Variable Employee Name: "+obj.employeeName);
        System.out.println("Instance Variable Employee Age: "+obj.employeeAge);
        obj.showEmployeeInfo();
        
        // Local variables cannot be used outside the methods where they are defined
        // System.out.println("Employee Salary: "+obj.employeeSalary);

        System.out.println("==========================================");     

        // Assign the data to instance variables using object 
        obj.employeeName="Ravi";
        obj.employeeAge=34;

        System.out.println("Instance Variable Employee Name: "+obj.employeeName);
        System.out.println("Instance Variable Employee Age: "+obj.employeeAge);
        obj.showEmployeeInfo();

        System.out.println("Company Name: "+companyName);
        System.out.println("Company Name: "+companyNames); // Not recommended way
        System.out.println("Company Name: "+VariableTypes.companyNames); // Recommended way

    }

}
