package com.messengerintegration;

public class SMS extends BasicMessenger
{
    private String name;

    private SendMessage send;

    SMS(String name, SendMessage send) {
        super();
        this.name = name;
        this.send = send;
    }   //SRP
    public void send()
    {
        System.out.println("Sending via " + name);
        send.send();
    }

    //SRP
    public void markAllAsRead()
    {
        System.out.println("Marking messages in "+name);
        MarkAllAsRead.markAllAsRead();
    }
}
