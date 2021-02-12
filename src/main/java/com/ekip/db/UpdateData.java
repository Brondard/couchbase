package com.ekip.db;

import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;

public class UpdateData {

    public static void updateDataPerson(Cluster cluster){
        cluster.query("UPDATE persons USE KEYS 'person-3' SET firstName='Maurice';");
        cluster.query("UPDATE persons USE KEYS 'person-1' SET knows = ARRAY_PUT(IFNULL(knows, []), 'person-5')");
    }

}
