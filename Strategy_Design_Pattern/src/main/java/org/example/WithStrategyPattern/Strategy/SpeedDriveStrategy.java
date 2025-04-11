package org.example.WithStrategyPattern.Strategy;

public class SpeedDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Speed Driving...");
    }
}
