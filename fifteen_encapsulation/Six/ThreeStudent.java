package fifteen_encapsulation.Six;

public class ThreeStudent {
    
    private int id; // ID Cannot be Zero(0) or less than Zero(0)
    private String name; 
    private boolean isAttended;

    // Setters & Getters 

    public void setId(int id) {
        // write validation for id 
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Setting Invalid ID");
        }
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
