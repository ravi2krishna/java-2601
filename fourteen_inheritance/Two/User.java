package fourteen_inheritance.Two;

public class User {
    
    public static void main(String[] args) {
        
        OneStudent student = new OneStudent();
        System.out.println("Student");
        student.watchVideos();

        TwoVideoAdmin videoAdmin = new TwoVideoAdmin();
        System.out.println("Video Admin");
        videoAdmin.watchVideos();
        videoAdmin.addVideos();

        ThreeSuperAdmin superAdmin = new ThreeSuperAdmin();
        System.out.println("Super Admin");
        superAdmin.watchVideos();
        superAdmin.addVideos();
        superAdmin.deleteVideos();

    }

}
