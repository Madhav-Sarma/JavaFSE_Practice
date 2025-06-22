package Week_1_Engeneering_Concepts.Algorithms_Data_Structures.Financial_Forecasting;

public class FinancialForecast {
    public static double compoundInterest(double initialValue, double rate, int period){
        if (period==0) return initialValue;
        return compoundInterest(initialValue, rate, period-1)*(1+rate);
    }
    public static void main(String[] args){
        double initialValue = 100.00;
        double rate = 0.05;
        int time = 5;

        // calling the recursive function
        double result = compoundInterest(initialValue,rate,time);

        // printing the result
        System.out.printf("forecasted value in %d years is : %.2f\n",time,result);

    }
}
