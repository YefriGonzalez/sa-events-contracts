package com.sa.events_contracts.wallet;

import java.math.BigDecimal;
import java.time.LocalDate;

public record PaymentConfirmedEvent(String sourceType, Long sourceId, Long userId, BigDecimal amount, Long branchId,
                LocalDate paymentDate, Long transactionId) {

}
