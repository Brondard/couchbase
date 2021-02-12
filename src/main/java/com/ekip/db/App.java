package com.ekip.db;


import com.couchbase.client.core.error.BucketNotFoundException;
import com.couchbase.client.core.error.IndexExistsException;
import com.couchbase.client.core.error.IndexNotFoundException;
import com.couchbase.client.core.error.ServerOutOfMemoryException;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Scope;
import com.couchbase.client.java.json.JsonObject;
import com.couchbase.client.java.query.QueryResult;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class App
{
    public static void main( String[] args ) {
        Cluster cluster = Cluster.connect(Constant.host, Constant.user, Constant.password);

        System.out.println("###### Delete existing primary indexes ######");
        try{
            CreateSchema.deleteIndex(cluster);
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }

        System.out.println("###### Delete existing Buckets #######");
        try {
            CreateSchema.deleteBucket(cluster);
        }
        catch (BucketNotFoundException ex) {
            System.err.println("Bucket didnt existed");
        }


        System.out.println("###### Create Buckets #######");
        CreateSchema.createBucket(cluster);

        System.out.println("###### Create Indexes #######");
        try {
            CreateSchema.createIndex(cluster);
        }
        catch (IndexExistsException ex) {
            System.err.println("Index exist, relaunch the app please...");
            System.exit(1);
        }

        System.out.println("###### Insert datas #######");
        InsertData.insertDataPersons(cluster);
        InsertData.insertDataOrders(cluster);
        InsertData.insertDataVendors(cluster);
        InsertData.insertDataProducts(cluster);

        cluster.waitUntilReady(Duration.ofMillis(5000));

        Utils.displayPerson(cluster);
        Utils.displayOrder(cluster);

        System.out.println("###### Deleting datas #######");
        DeleteData.deleteDataPerson(cluster);

        System.out.println("###### Updating datas #######");
        UpdateData.updateDataPerson(cluster);


        System.out.println("###### Select datas #######");
        System.out.println("###### Select ALL #######\n");
        System.out.println("### Select all datas from Vendors ###");
        Select.selectAllFromVendors(cluster);
        System.out.println("### Select all datas from Persons ###");
        Select.selectForAGivenCustomer(cluster);
        System.out.println("### Select all datas from Orders ###");
        Select.selectForAGivenProductandPeriod(cluster);
        System.out.println("### Select all datas from Products ###");
        Select.selectAllFromProduct(cluster);

        System.out.println("### Select ALL with Condition ###\n");





        Utils.displayPerson(cluster);

        cluster.disconnect();
    }
}
