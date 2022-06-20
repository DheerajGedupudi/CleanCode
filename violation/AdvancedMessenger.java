package com.company;

import com.company.photo.*;

public class AdvancedMessenger extends BasicMessenger
{
    private JPEG jpeg;
    AdvancedMessenger(String name, String message, JPEG jpeg) {
        super(name, message);
        this.name = name;
        this.jpeg = jpeg;
    }

    public void displayPic()
    {
        System.out.println("\nDisplaying the Profile Picture of "+name);
        ProfilePhoto.setProfilePic(jpeg);
    }

    public void setSendMessage(String message)
    {
        this.message = message;
    }

    public void markAllAsRead()
    {
        MessengerService.markAllAsRead();
    }

    @Override
    public void setProfilePic(JPEG jpeg) {
        this.jpeg = jpeg;
    }
}
