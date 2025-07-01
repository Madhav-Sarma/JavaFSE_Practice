package Week_2.JUnit_Mockito_SL4J.Mockito_Exercise.Mock_Stub;

public class MyService {    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}
