package org.example.Services;

public class SMSService implements NotificationService{

    @Override
    public void sendNotification() {
        System.out.println("SMS Service Activated");
    }
}
