package interfac.services;

public interface OnlinePaymentService {
    double paymentFee( double amount );
    double interest( double amoun, int months );
}
