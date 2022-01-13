public class CreditPaymentService {
    public double calculate(long credit, int term, double percent) {
        double x = 1 + (percent / 1200);
        double exp = Math.pow(x, -(12*term));
        double payment = credit * (percent / 1200) / (1 - exp);

        return payment;

    }
}
