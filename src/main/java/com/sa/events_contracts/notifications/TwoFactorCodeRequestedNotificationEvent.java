package com.sa.events_contracts.notifications;

import java.time.Instant;

public record TwoFactorCodeRequestedNotificationEvent(String eventId, Instant occurredAt, String email, String code,
        long expiresInMinutes) {

}
