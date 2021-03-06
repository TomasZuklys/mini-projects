package net.codinginaction.springcloudreservationclient.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ReservationClientChannels {
    @Output
    MessageChannel output();
}
