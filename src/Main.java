public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
                double payment = Math.round(service.calculate(1000_000, 1, 9.99));

        System.out.println("Ежемесячный платеж составит " + payment);

    }
}
