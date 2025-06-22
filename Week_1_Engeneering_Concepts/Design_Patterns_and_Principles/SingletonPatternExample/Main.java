package Week_1_Engeneering_Concepts.Design_Patterns_and_Principles.SingletonPatternExample;

public class Main {
    public static void main(String[] args){
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        System.out.println("Message from L1:"+l1.getC());
        System.out.println("Message from L2"+l2.getC());

        // now we set a new msg from L1 and check in L2
        l1.setC("Change in L1");

        System.out.println("after changing from L1, L1:"+l1.getC());
        System.out.println("after changing from L1, L2:"+l2.getC());

        if(l1 == l2){
            System.out.println("Yes, both are same");
        }
        else{
            System.out.println("No, both are different instances");
        }
    }
}
