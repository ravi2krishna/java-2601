package eight_branching;

public class Demo {
    
    public static void main(String[] args) {
        
        // without break
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }

        System.out.println("==========");
        
        // break: to exit a loop early
        for (int i = 1; i <=10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("==========");

        // break: to skip the current iteration
        for (int i = 1; i <=10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        // i'm inside main method and using return to get value from some where else
        System.out.println("Sum Of Numbers: "+addNumbers(200, 100));
    }

    // return: return value to the caller 
    public static int addNumbers(int a, int b) {
        return a + b;
    }

}
