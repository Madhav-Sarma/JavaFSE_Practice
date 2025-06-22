package Week_1_Engeneering_Concepts.Design_Patterns_and_Principles.FactoryMethodPatternExample;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
