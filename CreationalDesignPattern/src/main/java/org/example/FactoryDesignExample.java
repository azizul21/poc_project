package org.example;

import org.example.interfaces.Route;
import org.example.utility.ByAir;
import org.example.utility.ByRoad;
import org.example.utility.ByTrain;

public class FactoryDesignExample {

    public Route getRoute(String routeType){
        return routeType.equalsIgnoreCase("AIR") ?
                new ByAir() : routeType.equalsIgnoreCase("TRAIN") ?
                    new ByTrain() : new ByRoad();
    }
}
