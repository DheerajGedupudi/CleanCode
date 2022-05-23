package com.messengerintegration;

//SRP
public class SendText implements SendMessage
{
    @Override
    public void send()
    {
        System.out.println("Sending Text");
    }
}
