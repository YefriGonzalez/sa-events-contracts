package com.sa.events_contracts.notifications;

import java.time.Instant;
import java.util.UUID;

public record TwoFactorCodeRequestedNotificationEvent(UUID eventId, Instant occurredAt, String email, String code,
        long expiresInMinutes) {

}
