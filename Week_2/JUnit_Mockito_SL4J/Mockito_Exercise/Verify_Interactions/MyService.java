package Week_2.JUnit_Mockito_SL4J.Mockito_Exercise.Verify_Interactions;

public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}
