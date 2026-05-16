package ten_constructors.four;

public class ThisDemo {

    // Instance data 
    int x;
    int y;

    public  ThisDemo() {
        x = 100;
        y = 200;
    }

    // public  ThisDemo(int x, int y) {
    //     x = x;
    //     y = y;
    // }

    public  ThisDemo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int addNUmbers() {
        return x + y;
    }

    
    
    public static void main(String[] args) {
        
        ThisDemo obj = new ThisDemo();
        System.out.println("Sum Is: "+obj.addNUmbers());

        ThisDemo objTwo = new ThisDemo(10,20);
        System.out.println("Sum Is: "+objTwo.addNUmbers());

    }


}
