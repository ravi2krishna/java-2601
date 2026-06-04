package fifteen_encapsulation.Two;

import fifteen_encapsulation.One.OnePerson;

public class FourPerson {
    
    public static void main(String[] args) {
        
        OnePerson object = new OnePerson();
        System.out.println("Different Package Sub Class");
        
        System.out.println(object.publicName);
        // System.out.println(object.protectedName); // The field OnePerson.protectedName is not visible
        // System.out.println(object.defaultName); // The field OnePerson.defaultName is not visible
        // System.out.println(object.privateName); // The field OnePerson.privateName is not visible
    }

}
