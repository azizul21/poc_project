package org.example.utility;

import org.example.interfaces.Route;

public class ByAir implements Route {

    @Override
    public String message() {
        return "This is By Air Route";
    }
}
