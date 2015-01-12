package com.simple.developer.retrofit;


import android.util.Log;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

import java.util.List;

public class ElvisApiImpl {

    private RestAdapter adapter;
    private ElvisApiService service;
    private static final String BASE_URL = "http://oriji.co.ke";

    public ElvisApiImpl(){

        adapter = new RestAdapter
                .Builder()
                .setEndpoint(BASE_URL)
                .build();

        /* Create a service by passing the class name of the interface to the create method of the adapter */
        service = adapter.create(ElvisApiService.class);


    }

    /*
    * This method will call the interface method to actually make the GET request to the server
    *
    * As we defined it earlier, it takes a String keyword and a callback function;
    *
    * So we will do so here:
    * */
    public void fetchProducts(String keyword){

        service.getProductsFromServer(keyword, new Callback<List<Product>>() {
            @Override
            public void success(List<Product> products, Response response) {

                /*
                * As simple as that, we now have a list of products from the server
                *
                * Only if the call is successful; otherwise we catch our exception in failure() method
                *
                * If the call is successful, we can store the product in the db
                *
                * But since it is a List<Product>, we must loop through it;
                * */


                ProductModel model;

                for (Product product : products){

                    /* now here is one last step where ActiveAndroid comes in:
                    *
                    * We need to create an ActiveAndroid Model that will be stored in the db.
                    *
                    * It makes sense right? Awesome;
                    *
                    * That model will be a subclass of ActiveAndroid's Model class and we
                    *
                    * going to create it now
                    *
                    * */

                    model = new ProductModel();

                    /* Let us set the values for a single product like you would in regular sql statement */
                    model.setName(product.getName());
                    model.setType(product.getType());
                    model.setCategory(product.getCategory());
                    model.setDescription(product.getDescription());
                    model.setSerialNumber(product.getSerialNumber());
                    model.setYear(product.getManufacturedDate());

                    model.save();

                    /* That is it! If you had configured your db correctly in app, you would have real products now in your db
                    * You can then query the db - which as easy as calling the methods we created earlier inside ProductModel class.
                    *
                    * After getting the results from db, you can display them in a listview for android users to feast on!
                    *
                    * Any questions? I can show you how to configure ActiveAndroid if you need me to but they have good documentation too
                    *
                    * H
                    * */
                 }

             }

            @Override
            public void failure(RetrofitError retrofitError) {
                /*
                * We can log out the error here
                *
                *
                * */

                Log.d("RETROFITERROR", retrofitError.getMessage());
             }
        });
    }
}
