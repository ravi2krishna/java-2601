package fifteen_encapsulation.Two;

import fifteen_encapsulation.One.OnePerson;

public class ThreePerson extends OnePerson {
    
    public static void main(String[] args) {
        
        ThreePerson object = new ThreePerson();
        System.out.println("Different Package Sub Class");
        
        System.out.println(object.publicName);
        System.out.println(object.protectedName);
        // System.out.println(object.defaultName); // The field OnePerson.defaultName is not visible
        // System.out.println(object.privateName); // The field OnePerson.privateName is not visible
    }

}
