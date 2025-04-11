package org.example.Services;

public class NotificationFactory {
    public static NotificationService createNotification(String service){
        switch (service.trim().toUpperCase()){
            case "SMS":
               return new SMSService();
            case "PUSH":
                return new PushNotification();
            case "EMAIL":
                return new EmailService();
            default:
                throw new RuntimeException("Invalid type");
        }
    }
}
