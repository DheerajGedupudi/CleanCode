package com.messengerintegration;

import com.messengerintegration.interfaces.SendInterface;

//LSP
public abstract class BasicMessenger implements SendInterface
{

    //SRP
    public void send()
    {
        System.out.println("Sending via ");
//        sendText.send();
    }

}
