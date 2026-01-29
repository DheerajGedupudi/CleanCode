package com.messengerintegration;

public class SendEmoji implements SendMessage
{
    @Override
    public void send() {
        System.out.println("Sending Emoji");
    }
}
