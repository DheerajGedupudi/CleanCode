package com.company;

public class InvalidOperationException extends Exception
{
    InvalidOperationException(String message)
    {
        System.out.println(message);
    }
}
