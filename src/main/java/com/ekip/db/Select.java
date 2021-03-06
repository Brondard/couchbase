package com.ekip.db;
import com.couchbase.client.java.Cluster;


public class Select {


    //Q1
    /**
     * For a given customer, find his/her all related data including profile, orders, invoices,
     * feedback, comments, and posts in the last month, return the category in which he/she has
     * bought the largest number of products, and return the tag which he/she has engaged the
     * greatest times in the posts.
     */

    //Q2
    /**
     * For a given product during a given period, find the people who commented or
     * posted on it, and had bought it.
     */

    //Q3
    /**
     * For a given product during a given period, find people who have undertaken
     * activities related to it, e.g., posts, comments, and review, and return sentences from these texts
     * that contain negative sentiments.
     */


    //Q4
    /**
     * Find the top-2 persons who spend the highest amount of money in orders. Then for
     * each person, traverse her knows-graph with 3-hop to find the friends, and finally return the
     * common friends of these two persons
     */

    //Q5
    /**
     * Given a start customer and a product category, find persons who are this customer's
     * friends within 3-hop friendships in Knows graph, besides, they have bought products in the
     * given category. Finally, return feedback with the 5-rating review of those bought products
     */

    //Q6
    /**
     * Given customer 1 and customer 2, find persons in the shortest path between them
     * in the subgraph, and return the TOP 3 best sellers from all these persons' purchases.
     */

    //Q7
    /**
     *  For the products of a given vendor with declining sales compare to the former
     * quarter, analyze the reviews for these items to see if there are any negative sentiments.
     */

    //Q8
    /**
     * For all the products of a given category during a given year, compute its total sales
     * amount, and measure its popularity in the social media.
     */

    //Q9
    /**
     * Find top-3 companies who have the largest amount of sales at one country, for each
     * company, compare the number of the male and female customers, and return the most recent
     * posts of them.
     */

    //Q10
    /**
     * Find the top-10 most active persons by aggregating the posts during the last year,
     * then calculate their RFM (Recency, Frequency, Monetary) value in the same period, and return
     * their recent reviews and tags of interest.
     */


}
