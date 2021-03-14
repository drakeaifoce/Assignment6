package com.company.builder_implementation;

public class BuilderMain {
    public BuilderMain() {

    }

    public void startBuilderMain() {
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();
        director.createHouse(houseBuilder);
        House house = houseBuilder.getResult();

        System.out.println(house);
    }
}
