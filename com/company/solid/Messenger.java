package com.messengerintegration;

import com.messengerintegration.interfaces.MarkAllAsReadInterface;
import com.messengerintegration.photo.*;

public class Messenger implements MarkAllAsReadInterface, ProfilePicInterface
{
    private String name;

    private Photo profilePic;

    Messenger(String name)
    {
        this.name = name;
    }

    //DIP
    public String getPlatformName()
    {
        return name;
    }

    //DIP
    public void setProfilePic(Photo pic)
    {
        ProfilePic.setProfilePic(this, pic);
    }

    //SRP
    public void sendText(String text) {}

    //SRP
    public void markAllAsRead() {}

}
