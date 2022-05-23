package com.messengerintegration;

public class SendHashTag implements SendMessage
{
    @Override
    public void send() {
        System.out.println("Sending HashTag");
    }
}
