package fifteen_encapsulation.Six;

public class TwoTeacher {
    
    public static void main(String[] args) {
        
        OneStudent object = new OneStudent();

        // Set Student ID, Name & Attendance 
        object.setId(101);
        object.setName("John");
        object.setIsAttended(true);
        
        // Get Data
        System.out.println("Teacher Able To Change Data Of One Student: "+object.getId());
        System.out.println("Teacher Able To Change Data Of One Student: "+object.getName());
        System.out.println("Teacher Able To Change Data Of One Student: "+object.getIsAttended());

    }

}
