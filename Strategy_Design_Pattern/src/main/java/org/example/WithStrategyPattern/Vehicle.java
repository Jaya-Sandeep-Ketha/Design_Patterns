package org.example.WithStrategyPattern;

import org.example.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveObject){
        this.driveStrategy =  driveObject;
    }
    void drive(){
        driveStrategy.drive();
    }
}
