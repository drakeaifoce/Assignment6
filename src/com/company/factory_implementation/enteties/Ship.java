package com.company.factory_implementation.enteties;

import com.company.factory_implementation.enteties.interfaces.Transport;

public class Ship implements Transport {
    public Ship() {
    }

    @Override
    public void deliver() {
        System.out.println("Deliver by sea in a container in a ship");
    }
}
