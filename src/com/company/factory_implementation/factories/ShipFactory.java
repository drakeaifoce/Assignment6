package com.company.factory_implementation.factories;

import com.company.factory_implementation.enteties.Ship;
import com.company.factory_implementation.enteties.interfaces.Transport;
import com.company.factory_implementation.factories.abstracts.TransportFactory;

public class ShipFactory extends TransportFactory {
    public ShipFactory() {
    }

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
