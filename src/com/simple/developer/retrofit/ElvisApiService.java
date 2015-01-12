package com.simple.developer.retrofit;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

import java.util.List;


/**
 * Created by rocket on 1/12/15.
 */
public interface ElvisApiService {

    @GET("/api/v1/products/{keyword}")
    public void getProductsFromServer(@Path("keyword") String keyword, Callback<List<Product>> callback);
}

/* Let me explain a bit here then we can revisit POJO
*
* If you look at our interface method, it takes a String argument called keyword and a callback method/function
*
* That callback function will return a List of Product items
*
* But we didn't have the Product item yet so we must create it either from Scratch or just generate it
*
* Using the online tool.
*
* The relationship between our Product Model and our JSON data from our server is that they both have the same fields
*
* Like the properties that we will see in a second.
*
* Now, there are a bunch of getters and setters that come with those properties in that Product class. Let us go see it!*/
