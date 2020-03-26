public class CreditPaymentService {
    public int calculate(int amount,int term) {
        float yearPercent = 9.99f;
        float monthPercent = yearPercent/100/12;
        int monthTerm = term*12 ;
        double monthPayment= (amount*(monthPercent+(monthPercent/( Math.pow((1+monthPercent), monthTerm)-1))));
        return ((int)monthPayment);
    }
}
