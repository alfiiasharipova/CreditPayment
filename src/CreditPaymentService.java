import static java.lang.StrictMath.pow;

public class CreditPaymentService {
    public int calculate(int sum, float rate, int period) {
        rate /= 100*12;
        period *= 12;
        return (int)(sum * rate * pow(1+rate, period)/(pow(1+rate, period) - 1));
    }
}
