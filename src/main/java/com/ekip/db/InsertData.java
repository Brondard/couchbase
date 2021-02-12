package com.ekip.db;

import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;
import com.couchbase.client.java.json.JsonArray;
import com.couchbase.client.java.json.JsonObject;

public class InsertData {

    public static void insertDataPersons(Cluster cluster) {
        Collection colPersons = cluster.bucket(Constant.BUCKETPERSONSNAME).defaultCollection();
        colPersons.insert("person-1",
                JsonObject.create()
                        .put("firstName", "Marco")
                        .put("lastName", "Gilles")
                        .put("gender", "male")
                        .put("birthday", "1999-03-28")
                        .put("createdDate", "2020-12-30")
                        .put("location", "Valbonne")
                        .put("browserUsed", "Brave")
                        .put("place", "Route des dolines")
                        .put("knows", JsonArray.from("person-2", "person-3"))
                        .put("interests", JsonArray.from("Moto", "Voyage", "Voiture"))
                        .put("posted", JsonArray.from(
                                JsonObject.create()
                                        .put("createdDate", "2020-12-30")
                                        .put("location", "Valbonne")
                                        .put("browserUsed", "Brave")
                                        .put("content", "Je suis perdu au milieu de la fôret à l'aide")
                                        .put("length", "Je suis perdu au milieu de la fôret à l'aide".length())
                        ))
        );
        colPersons.insert("person-2",
                JsonObject.create()
                        .put("firstName", "Maxence")
                        .put("lastName", "Lefeuvre")
                        .put("gender", "male")
                        .put("birthday", "2005-06-02")
                        .put("createdDate", "2020-12-30")
                        .put("location", "Valbonne")
                        .put("browserUsed", "Chrome")
                        .put("place", "Route des dolines")
                        .put("knows", JsonArray.from("person-1", "person-3"))
                        .put("interests", JsonArray.from("Jeu vidéo", "Manga", "Japon"))
                        .put("posted", JsonArray.from(
                                JsonObject.create()
                                        .put("createdDate", "2020-12-30")
                                        .put("location", "Valbonne")
                                        .put("browserUsed", "Chrome")
                                        .put("content", "Woa cyberpunk")
                                        .put("length", "Woa cyberpunk".length())
                        ))
        );
        colPersons.insert("person-3",
                JsonObject.create()
                        .put("firstName", "Thomas")
                        .put("lastName", "Brondino")
                        .put("gender", "male")
                        .put("birthday", "2010-03-02")
                        .put("createdDate", "2020-12-30")
                        .put("location", "Valbonne")
                        .put("browserUsed", "Chrome")
                        .put("place", "Une rue dans le village")
                        .put("knows", JsonArray.from("person-1", "person-2"))
                        .put("interests", JsonArray.from("Moto", "Jeu vidéo", "Voiture"))
                        .put("posted", JsonArray.from(
                                JsonObject.create()
                                        .put("createdDate", "2020-12-30")
                                        .put("location", "Valbonne")
                                        .put("browserUsed", "Chrome")
                                        .put("content", "aled")
                                        .put("length", "aled".length())
                        ))
        );
        colPersons.insert("person-4",
                JsonObject.create()
                        .put("firstName", "Alexis")
                        .put("lastName", "Camorani")
                        .put("gender", "male")
                        .put("birthday", "2012-02-02")
                        .put("createdDate", "2020-12-30")
                        .put("location", "Nice")
                        .put("browserUsed", "Chrome")
                        .put("place", "tte facon nice cest nul")
                        .put("knows", JsonArray.from("person-2", "person-3"))
                        .put("interests", JsonArray.from("Jeu vidéo", "Sieste", "Alcool"))
                        .put("posted", JsonArray.from(
                                JsonObject.create()
                                        .put("createdDate", "2020-12-30")
                                        .put("location", "Nice")
                                        .put("browserUsed", "Chrome")
                                        .put("content", "Houla c'est l'heure de la sieste")
                                        .put("length", "Houla c'est l'heure de la sieste".length())
                        ))
        );
        colPersons.insert("person-5",
                JsonObject.create()
                        .put("firstName", "Cédric")
                        .put("lastName", "Bontemps")
                        .put("gender", "male")
                        .put("birthday", "1000-01-01")
                        .put("createdDate", "2020-12-30")
                        .put("location", "Loin")
                        .put("browserUsed", "Chrome")
                        .put("place", "Yeeeet")
                        .put("knows", JsonArray.from("person-2", "person-3"))
                        .put("interests", JsonArray.from("Art martiaux", "Ski"))
                        .put("posted", JsonArray.from(
                                JsonObject.create()
                                        .put("createdDate", "2020-12-30")
                                        .put("location", "Loin")
                                        .put("browserUsed", "Chrome")
                                        .put("content", "Euh les gars ?")
                                        .put("length", "Euh les gars ?".length())
                        ))
        );
        colPersons.insert("person-6",
                JsonObject.create()
                        .put("firstName", "PersonToDelete")
                        .put("lastName", "PersonToDelete")
                        .put("gender", "male")
                        .put("birthday", "999-01-01")
                        .put("createdDate", "2020-12-30")
                        .put("location", "Jerusalem")
                        .put("browserUsed", "Chrome")
                        .put("place", "Une grotte")
                        .put("knows", JsonArray.from())
                        .put("interests", JsonArray.from("Religion"))
                        .put("posted", JsonArray.from())
        );
    }

    public static void insertDataVendors(Cluster cluster) {
        Collection colVendor = cluster.bucket(Constant.BUCKETVENDORS).defaultCollection();
        colVendor.insert("vendor-1",
                JsonObject.create()
                        .put("country", "china")
                        .put("industry", "auto")
                        .put("name", "China Auto Confort")
        );
        colVendor.insert("vendor-2",
                JsonObject.create()
                        .put("country", "France")
                        .put("industry", "technology")
                        .put("name", "Tech Fr Industry")
        );
        colVendor.insert("vendor-3", JsonObject.create()
                .put("country", "Italy")
                .put("industry", "auto")
                .put("name", "Pot dech")
        );
        colVendor.insert("vendor-4", JsonObject.create()
                .put("country", "Germany")
                .put("industry", "toy")
                .put("name", "kinder")
        );
    }

    public static void insertDataProducts(Cluster cluster) {
        Collection colProducts = cluster.bucket(Constant.BUCKETPRODUCTS).defaultCollection();
        colProducts.insert("product-1",
                JsonObject.create()
                        .put("vendor", "vendor-1")
                        .put("asin", "product-1")
                        .put("title", "Lot de 4 couvertures de siège")
                        .put("price", 50)
                        .put("imgUrl", "https://google.image/")
                        .put("brand", "China auto confort")
                        .put("feedbacks", JsonArray.from(
                                JsonObject.create()
                                        .put("comment", "Déjà vu pire pour du made in China")
                                        .put("author", "person-1"),
                                JsonObject.create()
                                        .put("comment", "Je sais pas je l'ai pas acheté lol")
                                        .put("author", "person-2")
                                )
                        )

        );
        colProducts.insert("product-2",
                JsonObject.create()
                        .put("vendor", "vendor-2")
                        .put("asin", "product-2")
                        .put("title", "Enceinte bluetooth portative haut de gammme")
                        .put("price", 250)
                        .put("imgUrl", "https://google.image/")
                        .put("brand", "bose")
                        .put("feedbacks", JsonArray.from(
                                JsonObject.create()
                                        .put("comment", "Bon son")
                                        .put("author", "person-3")
                        ))
        );
        colProducts.insert("product-3",
                JsonObject.create()
                        .put("vendor", "vendor-2")
                        .put("asin", "product-3")
                        .put("title", "Souris bluetooth")
                        .put("price", 60)
                        .put("imgUrl", "https://google.image/")
                        .put("brand", "Racer")
                        .put("feedbacks", JsonArray.from(
                                JsonObject.create()
                                        .put("comment", "Les boutons additionnels sont cools et bien placés")
                                        .put("author", "person-4")
                        ))
        );
        colProducts.insert("product-4",
                JsonObject.create()
                        .put("vendor", "vendor-2")
                        .put("asin", "product-4")
                        .put("title", "Casque audio avec micro intégré")
                        .put("price", 80)
                        .put("imgUrl", "https://google.image/")
                        .put("brand", "Logimek")
                        .put("feedbacks", JsonArray.from(
                                JsonObject.create()
                                        .put("comment", "Son du micro à chier")
                                        .put("author", "person-3")
                        ))
        );
        colProducts.insert("product-5",
                JsonObject.create()
                        .put("vendor", "vendor-4")
                        .put("asin", "product-5")
                        .put("title", "Barbie danceuse étoile qui vole")
                        .put("price", 25)
                        .put("imgUrl", "https://google.image/")
                        .put("brand", "Barbie")
                        .put("feedbacks", JsonArray.from(
                                JsonObject.create()
                                        .put("comment", "Ma soeur a fini à l'hopital")
                                        .put("author", "person-5")
                        ))
        );
        colProducts.insert("product-6",
                JsonObject.create()
                        .put("vendor", "vendor-4")
                        .put("asin", "product-6")
                        .put("title", "Monster truck Hot Whils")
                        .put("price", 12)
                        .put("imgUrl", "https://google.image/")
                        .put("brand", "Hot Whils")
                        .put("feedbacks", JsonArray.from())
        );
    }

    public static void insertDataOrders(Cluster cluster) {
        Collection colOrders = cluster.bucket(Constant.BUCKETORDERSNAME).defaultCollection();
        colOrders.insert("order-1",
                JsonObject.create()
                        .put("buyer", "person-1")
                        .put("orderDate", "2020-12-30")
                        .put("totalPrice", 300)
                        .put("products", JsonArray.from("product-1", "product-2"))
        );
        colOrders.insert("order-2", JsonObject.create()
                .put("buyer", "person-1")
                .put("orderDate", "2021-01-05")
                .put("totalPrice", 125)
                .put("products", JsonArray.from("product-3", "product-6", "product-4"))
        );
        colOrders.insert("order-3", JsonObject.create()
                .put("buyer", "person-3")
                .put("orderDate", "2021-01-05")
                .put("totalPrice", 350)
                .put("products", JsonArray.from("product-1", "product-6", "product-2"))
        );
    }
}
