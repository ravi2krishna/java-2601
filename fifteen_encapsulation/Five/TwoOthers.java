package fifteen_encapsulation.Four;

public class TwoOthers {
    
    public static void main(String[] args) {
        
        OneStudent object = new OneStudent();

        object.id = 101;
        object.name = "Bad Name"; // Name was being changed, as it's not private 
        object.isAttended = false;
        System.out.println("Others Able To Change Data Of One Student: "+object.id);
        System.out.println("Others Able To Change Data Of One Student: "+object.name);
        System.out.println("Others Able To Change Data Of One Student: "+object.isAttended);

    }

}
