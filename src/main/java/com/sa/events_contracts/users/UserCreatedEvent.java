package com.sa.events_contracts.users;

import java.time.Instant;

public record UserCreatedEvent(String eventId, Instant occurredAt, Long userId, String email, String firstName,
        String lastName) {
}
