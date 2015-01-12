package com.simple.developer.retrofit;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by rocket on 1/12/15.
 */


@Table(name="products")
public class ProductModel extends Model {

    /*
    * Now we can define columns for our products table
    *
    * Now we can add some CRUD methods to query the db, insert(this is not necessary because save() is inherited from Model class)
    *
    * Things like selecting 1 product from db by id, deletion, and even deleting all; or even resetting table altogether
    *
    * As an example, we will just add one method to select all products and return them
    * */


    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="type")
    private String type;

    @Column(name="category")
    private String category;

    @Column(name="serialNumber")
    private String serialNumber;

    @Column(name="year")
    private String year;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setYear(String year) {
        this.year = year;
    }


    /* This returns all the products from db */

    public List<ProductModel> fetchAll(){
        return new Select()
                .all()
                .from(ProductModel.class)
                .execute();
    }

    public ProductModel fetchById(int id){

        return new Select()
                .from(ProductModel.class)
                .where("id = ?", id)
                .executeSingle();
    }

    /* Now we can go store our ProductModel in the db as soon as we get it from the web API */

 }
