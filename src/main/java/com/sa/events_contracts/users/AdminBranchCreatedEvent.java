package com.sa.events_contracts.users;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AdminBranchCreatedEvent(
                Long branchId,
                Long userId,
                String status,
                LocalDateTime timestamp) {
}