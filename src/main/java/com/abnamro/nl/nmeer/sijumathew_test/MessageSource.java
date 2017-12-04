package com.abnamro.nl.nmeer.sijumathew_test;


import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageSource {
    String CHANNEL_NAME = "commChannel";

    @Output
    MessageChannel commChannel();
}
