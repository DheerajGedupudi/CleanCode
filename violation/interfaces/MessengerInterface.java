package com.company.interfaces;

import com.company.InvalidOperationException;
import com.company.photo.*;

public interface MessengerInterface
{
    public void send();

    public void markAllAsRead() throws Exception;

    public void setProfilePic(JPEG jpeg) throws InvalidOperationException;
}
