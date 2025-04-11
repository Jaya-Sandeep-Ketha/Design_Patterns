package org.example.WithStrategyPattern;

import org.example.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
