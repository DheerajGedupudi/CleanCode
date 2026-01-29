package com.messengerintegration;

import com.messengerintegration.interfaces.MarkAllAsReadInterface;
import com.messengerintegration.interfaces.SendInterface;
import com.messengerintegration.photo.ProfilePicInterface;
import com.messengerintegration.photo.Photo;

//ISP
//LSP
public abstract class AdvancedMessenger implements ProfilePicInterface, SendInterface, MarkAllAsReadInterface
{

    public void setSendMessage(SendMessage sendMessage) {
    }

    public abstract void displayPic();

    @Override
    public void send()
    {
        System.out.println("Sending via ");
//        this.sendMessage.send();
    }

    @Override
    public void markAllAsRead() {
        System.out.println("Marking messages in ");
        MarkAllAsRead.markAllAsRead();
    }

    @Override
    public void setProfilePic(Photo pic) {
//        this.pic = pic;
    }
}
