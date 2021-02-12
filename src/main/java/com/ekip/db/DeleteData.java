package com.ekip.db;

import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;

public class DeleteData {

    public static void deleteDataPerson(Cluster cluster){
        Collection colPerson = cluster.bucket(Constant.BUCKETPERSONSNAME).defaultCollection();
        colPerson.remove("person-6");
    }

}
