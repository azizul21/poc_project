package org.example.utility;

import org.example.interfaces.Route;

public class ByRoad implements Route {
    @Override
    public String message() {
        return "This is By Road Route";
    }
}
