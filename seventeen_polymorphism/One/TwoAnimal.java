package seventeen_polymorphism.One;

// Method Overriding
// Super Class
public class TwoAnimal {
    
    // super class functionality
    public void sound() {
        System.out.println("Animal Making Sound");
    }

}

// Sub class 
class Cat extends TwoAnimal {

    @Override
    public void sound() {
        System.out.println("Cat Making Sound");
    }

}

// Sub class 
class Dog extends TwoAnimal {

    @Override
    public void sound() {
        System.out.println("Dog Making Sound");
    }

}

// Main Class To Test 
class Main {

    public static void main(String[] args) {
        
        TwoAnimal parentObject = new TwoAnimal();
        parentObject.sound();

        Cat catObject = new Cat();
        catObject.sound();

        Dog dogObject = new Dog();
        dogObject.sound();

    }

}
