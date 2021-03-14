package com.company.builder_implementation;

public class Director {
    public Director() {
    }

    public void createHouse(IHouseBuilder houseBuilder) {
        houseBuilder.reset();
        houseBuilder.buildWalls(4);
        houseBuilder.buildWindows(4);
        houseBuilder.buildDoors(4);
        houseBuilder.buildGarage(1);
        houseBuilder.buildFancyStatues(2);
        houseBuilder.buildSwimmingPool(1);
        houseBuilder.buildGarden(1);
        houseBuilder.buildRoof(1);
    }
}
