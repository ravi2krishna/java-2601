package seventeen_polymorphism.TwoApp;

// Interface is for Contract 
// Set Contract For All Persons Like Students, Trainers, Mentors, Admins etc 
public interface Personable {

    // abstract methods (must things) -> contracts 
    public void setPersonDetails();

    public void displayPersonDetails();

    default void calculateFinalAchievement(){}

}
