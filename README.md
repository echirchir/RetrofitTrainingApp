# RetrofitTrainingApp

This is a sample android app demonstrating how to make RESTful API requests in android using Retrofit Library.

Here are the jar files required:

1) Retrofit jar
2) Gson jar
3) okHttp jar
4) okHttp-urlconnection jar
5) ActiveAndroid jar

The steps to create a functioning app that makes an API request to an endpoint are as follows:

Step 1: 
      Create an interface with a method in it - it could be a GET, POST, etc. You also define the return type of your
      method as either void - meaning your callback will explicitly declare a type or if your method has a type other
      than void, you don't have to state so in your callback.

Step 2:
      Create Plain Old Java Object (POJO) - this should match the object you expect to receive from your API call to 
      the server. It must contain the fields you want to see. To generate plain old java objects, instead of doing 
      so manually, you can use an online tool available here: jsonschema2pojo.org - remember to select json, Gson       and Use primitive types respectively. Then copy the results of clicking Preview button and paste it into your       Java class that you created earlier in your IDE. That is all.
      
Step 3:
      From somewhere in your app, create a RestAdapter and by calling its create() , create an apiService instance
      and pass your interface class to the above mentioned create() method. Now call your apiService's method to
      fetch results from a remote server. Remember to always pass a BASE_URL to your adapter builder instance.
      Now inside a Callback's success method, save your items to the db by looping through if you get back a list
      of items. If you have not created a model to represent your data, move to step 4:
      
Step 4:
     Create a model class that is a subclass of ActiveAndroid's Model class. You can then add the @Table annotation
     and subsequently add columns that match your results from the server. Then add methods to access and update
     your products in the sqlite table.
     
You can read more about Retrofit at http://square.github.io/retrofit/ and ActiveAndroid setup at https://github.com/pardom/ActiveAndroid/wiki/Getting-started. Good luck!
    
