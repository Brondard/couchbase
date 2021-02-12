package com.ekip.db;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.manager.bucket.BucketSettings;
import com.couchbase.client.java.manager.bucket.BucketType;
import com.couchbase.client.java.manager.collection.CollectionSpec;

import java.time.Duration;

public class CreateSchema {



    public static void deleteBucket(Cluster cluster){
        cluster.buckets().dropBucket(Constant.BUCKETORDERSNAME);
        cluster.buckets().dropBucket(Constant.BUCKETPERSONSNAME);
        cluster.buckets().dropBucket(Constant.BUCKETPRODUCTS);
        cluster.buckets().dropBucket(Constant.BUCKETVENDORS);
    }

    public static void createBucket(Cluster cluster){
        cluster.buckets().createBucket(BucketSettings.create(Constant.BUCKETPERSONSNAME));
        cluster.buckets().createBucket(BucketSettings.create(Constant.BUCKETORDERSNAME));
        cluster.buckets().createBucket(BucketSettings.create(Constant.BUCKETPRODUCTS));
        cluster.buckets().createBucket(BucketSettings.create(Constant.BUCKETVENDORS));
    }

    public static void createIndex(Cluster cluster){
        cluster.queryIndexes().createPrimaryIndex(Constant.BUCKETPERSONSNAME);
        cluster.queryIndexes().createPrimaryIndex(Constant.BUCKETORDERSNAME);
        cluster.queryIndexes().createPrimaryIndex(Constant.BUCKETPRODUCTS);
        cluster.queryIndexes().createPrimaryIndex(Constant.BUCKETVENDORS);
    }

    public static void deleteIndex(Cluster cluster){
        cluster.queryIndexes().dropPrimaryIndex(Constant.BUCKETPERSONSNAME);
        cluster.queryIndexes().dropPrimaryIndex(Constant.BUCKETORDERSNAME);
        cluster.queryIndexes().dropPrimaryIndex(Constant.BUCKETPRODUCTS);
        cluster.queryIndexes().dropPrimaryIndex(Constant.BUCKETVENDORS);
    }
}
