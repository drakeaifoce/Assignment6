package com.company.builder_implementation;

public interface IHouseBuilder {
    void reset();

    void buildWalls(int walls);

    void buildWindows(int windows);

    void buildDoors(int doors);

    void buildRoof(int roof);

    void buildGarage(int garage);

    void buildSwimmingPool(int swimmingPool);

    void buildFancyStatues(int fancyStatues);

    void buildGarden(int garden);

    House getResult();
}
