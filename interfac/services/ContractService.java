package interfac.services;

import java.time.LocalDate;

import interfac.entities.Contract;
import interfac.entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double quota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) { //Para cada mês, calcula:
            LocalDate dueDate = contract.getDate().plusMonths(i); //A data de vencimento da parce;a, adicionando 'i' meses a data do contrato

            double interest = onlinePaymentService.interest(quota, i); //Os juros aplicados a quota para o mês i

            double feePayment = onlinePaymentService.paymentFee(quota + interest); //A taxa de pagamento aplicada sobre a soma da quota e dos juros

            double quotaTotal = quota + feePayment + interest; // O valor total da parcela

            contract.getInstallments().add(new Installment(dueDate, quotaTotal));
        }
    }
}
