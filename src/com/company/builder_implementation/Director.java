package com.company.builder_implementation;

public class Director {
    public Director() {
    }

    public void createHouse(IHouseBuilder houseBuilder) {
        houseBuilder.reset();
        houseBuilder.buildDoors(4);
    }
}
