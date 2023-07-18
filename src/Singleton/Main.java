package Singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var DBConnection = Singleton.DBconnection.getDbConnection();
        DBConnection.addQuery("1. query");
        DBConnection.addQuery("2. query");
        DBConnection.showQueries();
        var a = Singleton.DBconnection.getDbConnection();
        System.out.println(a);
        System.out.println(DBConnection);
        var b = DBConnection.getDbConnection();
        System.out.println(b);


    }
}