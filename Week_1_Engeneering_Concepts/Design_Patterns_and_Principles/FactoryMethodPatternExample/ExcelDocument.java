package Week_1_Engeneering_Concepts.Design_Patterns_and_Principles.FactoryMethodPatternExample;

public class ExcelDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening Excel document...");
    }
}
