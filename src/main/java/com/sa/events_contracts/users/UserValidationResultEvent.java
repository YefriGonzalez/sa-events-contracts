package com.sa.events_contracts.users;

public record UserValidationResultEvent(
                Long userId,
                Long branchId,
                String transactionStatus) {
}