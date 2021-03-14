package com.company.factory_implementation.factories;

import com.company.factory_implementation.enteties.Truck;
import com.company.factory_implementation.enteties.interfaces.Transport;
import com.company.factory_implementation.factories.abstracts.TransportFactory;

public class TruckFactory extends TransportFactory {
    public TruckFactory() {
    }

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
