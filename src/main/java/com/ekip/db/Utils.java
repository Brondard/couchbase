package com.ekip.db;

import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.json.JsonObject;
import com.couchbase.client.java.query.QueryResult;

public class Utils {

    public static void displayPerson(Cluster cluster){
        QueryResult result = cluster.query("select firstName, lastName, meta(persons).id as id from persons;");
        String display = "DISPLAY PERSONS COLLECTIONS :\n";
        for(JsonObject jo: result.rowsAsObject()){
            display += "\t"+jo.toString();
        }
        System.out.println(display);
    }

    public static void displayOrder(Cluster cluster){
        QueryResult result = cluster.query("select meta(orders).id as id from orders;");
        String display = "DISPLAY ORDERS COLLECTIONS :\n";
        for(JsonObject jo: result.rowsAsObject()){
            display += "\t"+jo.toString();
        }
        System.out.println(display);
    }

}
