package com.company.singleton_implementation;

import com.company.singleton_implementation.singleton.Database;

public class SingletonMain {
    public SingletonMain() {
    }

    public void startSingletonMain() {
        Database database = Database.getInstance();
        database.query("SELECT * FROM users");

        Database db = Database.getInstance();
        db.query("SELECT * FROM users");
    }
}
