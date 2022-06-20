package com.company;

//SRP
public class MessengerService
{
    //OCP
    public static void send(String message)
    {
        if (message.equalsIgnoreCase("text"))
        {
            System.out.println("Sending Text");
        }
        else if (message.equalsIgnoreCase("emoji"))
        {
            System.out.println("Sending Emoji");
        }
        else if (message.equalsIgnoreCase("hashTag"))
        {
            System.out.println("Sending HashTag");
        }
        else
        {
            System.out.println("Error sending message");
        }
    }
    public static void markAllAsRead()
    {
        System.out.println("Marking all messages as Read");
    }
}
