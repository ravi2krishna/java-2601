package fifteen_encapsulation.Six;

public class OneStudent {
    
    private int id;
    private String name; // no private means others can change / modify this 
    private boolean isAttended;

    // Setters & Getters 

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIsAttended(boolean isAttended) {
        this.isAttended = isAttended;
    }

    public boolean getIsAttended() {
        return isAttended;
    }



}
