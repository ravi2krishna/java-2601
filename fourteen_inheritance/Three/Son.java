package fourteen_inheritance.Three;

public class Son extends Father {
    
    public void hasCar() {
        System.out.println("Son");
        System.out.println("Has Car");

    }

    public static void main(String[] args) {
        
        Son son = new Son();
        son.hasCar();
        son.hasHouse(); 
        son.hasLand();

    }

}
