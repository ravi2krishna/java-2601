package fifteen_encapsulation.One;

public class OnePerson {
    
    public String publicName = "Public Name";
    protected String protectedName = "Protected Name";
    // default String defaultName = "Default Name"; // default means no access modifier
    String defaultName = "Default Name"; // default means no access modifier
    private String privateName = "Private Name";

    public void display() {
        System.out.println("Inside Same Class");
        System.out.println(publicName);
        System.out.println(protectedName);
        System.out.println(defaultName);
        System.out.println(privateName);
    }

    // NOTE: Above shows no issues

}
