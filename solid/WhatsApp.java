package com.messengerintegration;

import com.messengerintegration.photo.Photo;

public class WhatsApp extends AdvancedMessenger
{

    private final String userName;
    private SendMessage sendMessage;
    private Photo pic;

    WhatsApp(String name, SendMessage sendMessage, Photo pic) {
        super();
        this.userName = name;
        this.sendMessage = sendMessage;
        this.pic = pic;
    }

    @Override
    public void displayPic()
    {
        System.out.println("\nDisplaying the Profile Picture of ");
        pic.displayPic();
    }

    @Override
    public void send()
    {
        System.out.println("Sending from " +userName);
        this.sendMessage.send();
    }

    @Override
    public void markAllAsRead() {
        System.out.println("Marking messages for "+userName);
        MarkAllAsRead.markAllAsRead();
    }

    @Override
    public void setProfilePic(Photo pic) {
        this.pic = pic;
    }
}
