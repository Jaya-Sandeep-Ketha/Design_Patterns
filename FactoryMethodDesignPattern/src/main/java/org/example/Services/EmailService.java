package org.example.Services;

public class EmailService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Email Service Activated");
    }
}
