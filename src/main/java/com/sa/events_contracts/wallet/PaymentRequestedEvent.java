package com.sa.events_contracts.wallet;

import java.math.BigDecimal;
import java.time.LocalDate;

public record PaymentRequestedEvent(String eventId, String sourceType, // Tipo: "TICKET_ORDER" | "RENTAL"
                Long sourceId, // Id de ticket order o renta
                Long userId, BigDecimal amount, Long branchId, LocalDate paymentDate) {

}
