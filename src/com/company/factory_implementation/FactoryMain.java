package com.company.factory_implementation;

import com.company.factory_implementation.enteties.interfaces.Transport;
import com.company.factory_implementation.factories.ShipFactory;
import com.company.factory_implementation.factories.TruckFactory;
import com.company.factory_implementation.factories.abstracts.TransportFactory;

import java.util.Scanner;

public class FactoryMain {
    public FactoryMain() {
    }

    public void startFactoryMain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose transport method: " + "\n" + "Land, water are available");
        String requirement = scanner.next();

        TransportFactory transportFactory = createTransport(requirement);
        Transport transport = transportFactory.createTransport();

        transport.deliver();
    }

    public static TransportFactory createTransport(String requirement){
        if(requirement.equalsIgnoreCase("Land")){
            return new TruckFactory();
        } else if (requirement.equalsIgnoreCase("Water")){
            return new ShipFactory();
        }
        else {
            throw new RuntimeException(requirement + " is not available, please choose available transport method");
        }
    }
}
