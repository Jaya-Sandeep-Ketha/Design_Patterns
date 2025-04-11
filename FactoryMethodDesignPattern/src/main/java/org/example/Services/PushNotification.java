package org.example.Services;

public class PushNotification implements NotificationService{

    @Override
    public void sendNotification() {
        System.out.println("Push Notification Activated");
    }
}
