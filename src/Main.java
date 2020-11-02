public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = service.calculate(1_000_000, 9.99f, 1);
        System.out.println(payment);
        payment = service.calculate(1_000_000, 9.99f, 2);
        System.out.println(payment);
        payment = service.calculate(1_000_000, 9.99f, 3);
        System.out.println(payment);
    }
}
