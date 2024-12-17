package org.example.utility;

import org.example.interfaces.Route;

public class ByTrain implements Route {
    @Override
    public String message() {
        return "This is By Train Route";
    }
}
