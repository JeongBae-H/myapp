package com.test3;

class Database {
    void open() { System.out.println("Database Open");}
}
class MySql extends Database {
    void open() { System.out.println("MySql Open()");}
}
class Oracle extends Database {
    void open() { System.out.println("Oracle Open()");}
}

public class Main {
    static Database CreateDatabase(String dbName) {
        Database db = null;
        switch(dbName){
            case "MySql":
                db = new MySql();
                break;
            case "Oracle":
                db = new Oracle();
                break;
        }
        return db;
    }
    public static void main(String[] args){
        Database db = CreateDatabase("MySql");
        db.open();
        Database db2 = CreateDatabase("Oracle");
        db2.open();
    }

}