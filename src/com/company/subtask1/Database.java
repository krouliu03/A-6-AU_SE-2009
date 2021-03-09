package com.company.subtask1;

public class Database {

    private static Database instance = null;
    public String s;

    private Database()
    { }

    public static Database getInstance()
    {
        if (instance == null)
            instance = new Database();

        return instance;
    }

}
