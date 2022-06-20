package com.messengerintegration.photo;

import com.messengerintegration.Messenger;

public class ProfilePic
{
    public static void setProfilePic(Messenger messenger, Photo pic)
    {
        System.out.println("The Profile picture for "+messenger.getPlatformName()+" is set to");
        pic.displayPic();
    }
}
