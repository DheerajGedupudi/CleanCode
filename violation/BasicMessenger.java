package com.company;


import com.company.photo.*;

//LSP
public class BasicMessenger extends Messenger
{
    protected String name;
    protected String message;

    BasicMessenger(String name, String message)
    {
        super(name);
        this.message = message;
    }

    public void send()
    {
        System.out.println("Sending via ");
        MessengerService.send(this.message);
    }


    public void markAllAsRead()
    {
            try
            {
                throw new Exception("This messenger cannot mark messages as read");
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
                ex.getMessage();
            }
    }

    public void setProfilePic(JPEG jpeg) throws InvalidOperationException
    {
        throw new InvalidOperationException("This messenger is not allowed to have Profile Picture");
    }

}
