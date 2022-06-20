package com.company;

import com.company.photo.*;

public class Main
{
    public static void main(String[] args) {
        //Basic : Send Text;
        //Advanced : Basic + ProfilePhoto + modify Message + Mark all as read.

        JPEG jpeg = new JPEG();

        BasicMessenger telegram = new SMS("James", "text");
        AdvancedMessenger whatsapp = new WhatsApp("John", "emoji", jpeg);

        telegram.send();

        whatsapp.send();
        whatsapp.setSendMessage("hashtag");
        whatsapp.send();

        whatsapp.displayPic();
    }
}

