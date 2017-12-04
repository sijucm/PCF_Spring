package com.abnamro.nl.nmeer.sijumathew_test;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface TestGateWay {

    @Gateway(requestChannel = MessageSource.CHANNEL_NAME)
    void generateWork(String s);


}
