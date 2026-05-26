package tweleve_strings;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class TwoMethods {

    public static void main(String[] args) {
        
        // Simulate Gmail Functionality 
        //         RaVi2kRIshna               -> ravi2krishna@gmail.com 

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Email ID: ");
        // String email = input.next();
        String email = input.nextLine();
        System.out.println("Original Email: "+email);
        // System.out.println("Length Of String: "+email.length());
        
        // toLowerCase() method returns a new string where all uppercase characters are converted to lowercase
        String transformedEmail = email.toLowerCase();
        System.out.println("Transformed Email: "+transformedEmail);

        // trim() method of the String class removes all leading and trailing whitespace from a string
        transformedEmail = transformedEmail.trim(); 
        System.out.println("Transformed Email: "+transformedEmail);

        // Add domain 
        String domain = "@gmail.com";

        // concat(String str) method is used to append one string to the end of another
        transformedEmail = transformedEmail.concat(domain);
        System.out.println("Transformed Email: "+transformedEmail);


        // Simulate PAN Functionality      
        System.out.println("Enter PAN ID: ");
        String pan = input.nextLine();
        System.out.println("Original PAN: "+pan);

        // matches() method in Java checks whether an entire string matches a specified regular expression (regex).
        boolean validPan = pan.matches("[A-Za-z0-9]+");
        System.out.println("Given PAN " +pan+ " is "+validPan );

        if (pan.matches("[A-Za-z0-9]+") && pan.length() == 10) {
            System.out.println("Given PAN: "+pan);
            
            // toUpperCase() method converts a string to all capital letters 
            System.out.println("Transformed PAN: "+pan.toUpperCase());

        } else {
            System.out.println("Given PAN " +pan+ " is INVALID");
        }


        // Simulate ISD Phone Call Functionality      
        // https://us1.discourse-cdn.com/flex016/uploads/weweb/original/2X/d/dbe25afb4aeb05640347e2f7c1b7ae532ebb28f2.png
        // https://www.shutterstock.com/image-vector/discount-coupon-gift-voucher-design-260nw-2048247971.jpg

        // startsWith() method of the String checks whether a string begins with a 
        // specific sequence of characters. It returns true if the string matches the 
        // specified prefix and false otherwise.
        System.out.println("Enter Phone Number Starting With ISD Code: ");
        String contactNumber = input.nextLine();

        System.out.println("Is it india number: " +contactNumber.startsWith("+91"));

        if (contactNumber.startsWith("+91")) {
            System.out.println("Calling India Number - Charged In Rupees");
        } else if (contactNumber.startsWith("+33")) {
            System.out.println("Calling France Number - Charged In Euros");
        } else if (contactNumber.startsWith("+1")) {
            System.out.println("Calling USA Number - Charged In Dollars");
        } else {
            System.out.println("Invalid Number - Only India, France & USA Supported");
        }


        // Simulate Email Synchronization 
        // source ravi@gmail.com & destination is krishna@microsoft.com (Fails)
        // source ravi@gmail.com & destination is krishna@gmail.com (Success)
    
        System.out.println("Enter Source Email ID: ");
        String sourceEmail = input.nextLine();

        System.out.println("Enter Destination Email ID: ");
        String destinationEmail = input.nextLine();

        // endsWith() method in Java checks if a string ends with a specific sequence 
        // of characters, returning a boolean value.
        // It returns true if the string matches the 
        // specified suffix and false otherwise.

        if (sourceEmail.endsWith("@gmail.com") && destinationEmail.endsWith("@gmail.com")) {
            System.out.println("Email Backup Process Started");
        } else {
            System.out.println("Email Backup Process Failed - Source & Destination didn't match");
        }

        // Simulate Data Operations Work: CSV Data from a file and perform some operations 
        // https://www.datablist.com/learn_images/csv/google_sheet_csv.png
        // https://www.slashgear.com/img/gallery/csv-files-explained-what-they-are-and-how-to-open-them/what-are-csv-files-1699455969.jpg
        // Name,Email,Age,City,Job_Role
        // String employeeData = "John,john@apple.com,30,Hyderabad,Developer"
        // Requirement: Display Employee Name & Job Role

        // substring() method extracts a portion of a string and returns it as a new string 
        // It uses a zero-based index, meaning the first character of the string is at position 0.
        String employeeData = "John,john@apple.com,30,Hyderabad,Developer";
        String employeeName = employeeData.substring(0, 4);
        System.out.println("Employee Name: "+employeeName);

        String newEmployeeData = "Michael,michael@apple.com,30,Hyderabad,Developer";
        String newEmployeeName = newEmployeeData.substring(0, 4);
        System.out.println("Employee Name: "+newEmployeeName);

        // above approach is static, we have hard coded logic, which is not good 
        // To get it done using dynamic approach
        
        // split() method breaks a string into an array of substrings based on a regular expression (regex) delimiter
        // String employeesDataOne = "John,john@apple.com,30,Hyderabad,Developer";
        String employeesDataOne = "Michael,michael@apple.com,30,Hyderabad,Developer";
        String[] employeesDataOneSplitted = employeesDataOne.split(",");
        System.out.println("Data: "+employeesDataOneSplitted); 
        for (String data : employeesDataOneSplitted) {
            System.out.println(data);
        }
        System.out.println("Employee Name: "+employeesDataOneSplitted[0]);
        System.out.println("Employee Role: "+employeesDataOneSplitted[4]);
    }
}
