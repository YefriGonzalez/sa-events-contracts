package com.sa.events_contracts.wallet;

public record PaymentRejectedEvent(String sourceType, Long sourceId, String reason) {
}
