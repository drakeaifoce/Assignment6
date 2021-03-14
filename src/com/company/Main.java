package com.company;

import com.company.builder_implementation.BuilderMain;
import com.company.factory_implementation.FactoryMain;
import com.company.singleton_implementation.SingletonMain;

public class Main {

    public static void main(String[] args) {
        SingletonMain singletonMain = new SingletonMain();
        FactoryMain factoryMain = new FactoryMain();
        BuilderMain builderMain = new BuilderMain();

//        factoryMain.startFactoryMain();
//        singletonMain.startSingletonMain();
        builderMain.startBuilderMain();
    }
}
