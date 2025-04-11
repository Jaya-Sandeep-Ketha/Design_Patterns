package org.example;

import org.example.Services.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Notification Type (EMAIL / SMS / PUSH):");
        String service = scanner.nextLine();
        try{
            NotificationService notificationService = NotificationFactory.createNotification(service);
            notificationService.sendNotification();
        }
        catch (RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}