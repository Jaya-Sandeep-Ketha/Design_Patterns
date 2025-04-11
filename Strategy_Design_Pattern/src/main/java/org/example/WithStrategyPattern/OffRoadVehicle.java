package org.example.WithStrategyPattern;

import org.example.WithStrategyPattern.Strategy.SpeedDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SpeedDriveStrategy());
    }
}
