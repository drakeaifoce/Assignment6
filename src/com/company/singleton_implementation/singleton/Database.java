package com.company.singleton_implementation.singleton;

public class Database {
    private static Database instance;

    public Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }

        return instance;
    }

    public void query(String sql) {
        System.out.println("1. User");
    }
}
