package com.messengerintegration;

import com.messengerintegration.photo.*;

public class Main
{
    public static void main(String[] args)
    {
        //Basic : Send Message.
        //Advanced : Basic + ProfilePhoto + modify Message + Mark all as read.

        SendMessage sendMessage = new SendEmoji();
        //OCP
        BasicMessenger telegram = new SMS("James", sendMessage);
        telegram.send();


        //OCP
        //DIP
        SendMessage send1 = new SendText();
        SendMessage send2 = new SendEmoji();
        SendMessage send3 = new SendHashTag();


        Photo picc = new PNG();

        AdvancedMessenger chatMachine = new WhatsApp("John", send2, picc);
        chatMachine.send();

        chatMachine.setSendMessage(send1);
        chatMachine.send();

        chatMachine.setSendMessage(send3);
        chatMachine.send();

        Photo pic1 = new JPEG();
        chatMachine.setProfilePic(pic1);

        chatMachine.displayPic();

        Photo pic2 = new PNG();
        chatMachine.setProfilePic(pic2);

        chatMachine.displayPic();


    }
}

