package net.codinginaction.springcloudminiproject.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ReservationServiceChannel {

    @Input
    SubscribableChannel input();

}
