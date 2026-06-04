package fifteen_encapsulation.One;

public class TwoPerson {
    
    public static void main(String[] args) {
        
        OnePerson object = new OnePerson();
        System.out.println("Same Package Different Class");
        
        System.out.println(object.publicName);
        System.out.println(object.protectedName);
        System.out.println(object.defaultName);
        // System.out.println(object.privateName); // The field OnePerson.privateName is not visible

    }

}
