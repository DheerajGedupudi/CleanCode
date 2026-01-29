package com.company;

import com.company.interfaces.MessengerInterface;
import com.company.photo.*;

public class Messenger implements MessengerInterface
{
    private String name;

    Messenger(String name)
    {
        this.name = name;
    }

    public void setProfilePic(JPEG jpeg) throws InvalidOperationException {
        ProfilePhoto.setProfilePic(jpeg);
    }

    public void send(String text) {

    }

    public void send() {

    }

    public void markAllAsRead() throws Exception {

    }
}
