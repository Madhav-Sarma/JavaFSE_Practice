package Week_1_Engeneering_Concepts.Design_Patterns_and_Principles.SingletonPatternExample;

public class Logger {
    private String c;
    private static Logger newLogger;

    // this is a constructor : constructors don't have any return type
    private Logger(){
        c="the instance is created";
    }

    // getting instance
    public static Logger getInstance(){
        // creating by checking for existing instance
        if(newLogger == null){
            newLogger = new Logger();
        }
        return newLogger;
    }

    // printing for checking
    public String getC(){
        return c;
    }

    // setting new string to c
    public void setC(String newC){
        this.c=newC;
    }
}
