public class Main {
    public static void main(String[] args) {
        CreditPaymentService  service = new CreditPaymentService();

        // сумма кредита 1 000 000 руб, срок 1 год
        int amount=1_000_000;
        int term=1;
        int monthPayment = service.calculate(amount,term);
        System.out.println("Ежемесячный платёж (сумма кредита " + amount+ " руб, срок в годах: " +term + " ) : "+ monthPayment);

        // сумма кредита 1 000 000 руб, срок 2 года
        amount=1_000_000;
        term=2;
        monthPayment = service.calculate(amount,term);
        System.out.println("Ежемесячный платёж (сумма кредита " + amount+ " руб, срок в годах: " +term+ " ) : "+ monthPayment);

        // сумма кредита 1 000 000 руб, срок 3 года
        amount=1_000_000;
        term=3;
        monthPayment = service.calculate(amount,term);
        System.out.println("Ежемесячный платёж (сумма кредита " + amount+ " руб, срок в годах: " +term +" ) : "+ monthPayment);

    }
}
