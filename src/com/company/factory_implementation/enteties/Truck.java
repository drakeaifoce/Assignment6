package com.company.factory_implementation.enteties;

import com.company.factory_implementation.enteties.interfaces.Transport;

public class Truck implements Transport {
    public Truck() {
    }

    @Override
    public void deliver() {
        System.out.println("Deliver by land in a box in a truck");
    }
}
