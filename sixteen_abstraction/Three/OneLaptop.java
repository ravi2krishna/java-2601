// Contract Like Behavior 

// Laptop Contract - Government said these are must features for building laptops 

package sixteen_abstraction.Three;

// Interface
public interface OneLaptop {

    // Concrete Methods - Methods With Body 
    // public void processorComponent() {
    //     System.out.println("Laptop");
    //     System.out.println("Processor");
    //     System.out.println("Functionality");

    // }

    // Abstract Methods - Methods Without Body 
    public void processorComponent();

    public void memoryComponent();
    
    public void diskComponent();

    public void networkComponent();

    // In 2026 bio metric authentication is mandatory 

    // public void bioMetricAuthentication() {
    //     System.out.println("Government Providing Bio Metric Authentication");
    // }

    default void bioMetricAuthentication() {
        System.out.println("Government Providing Bio Metric Authentication");
    }

}
