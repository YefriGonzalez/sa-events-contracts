package com.sa.events_contracts.notifications;

import java.time.Instant;
import java.util.List;

public record GenericNotificationEvent(
        String eventId,
        Instant occurredAt,
        Long userId,
        String subject, // obligatorio
        String title, // obligatorio
        List<String> paragraphs, // opcional
        String buttonText, //
        String buttonUrl// opcional
) { // opcional
}