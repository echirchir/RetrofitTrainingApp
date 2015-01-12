package com.simple.developer.retrofit;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @Expose
    private String name;
    @Expose
    private String description;
    @Expose
    private String type;
    @Expose
    private String category;
    @SerializedName("serial_number")
    @Expose
    private String serialNumber;
    @SerializedName("manufactured_date")
    @Expose
    private String manufacturedDate;

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The category
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     * The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @return
     * The serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     *
     * @param serialNumber
     * The serial_number
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     *
     * @return
     * The manufacturedDate
     */
    public String getManufacturedDate() {
        return manufacturedDate;
    }

    /**
     *
     * @param manufacturedDate
     * The manufactured_date
     */
    public void setManufacturedDate(String manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

}

/* Let us go online to the  POJO tool - you see we are taking just 1 sample because all Products have the same fields! So we just need one
*
* to figure out the structure of our class (Model). Does that make sense?I hope am not mumbling.MAKES SENSE - cool so basically every property has a getter
* and setter method that we shall use later down the road.
*
* Gson - courtesy of Google (their motto is "Don't be evil" - and yet they are), is pretty badass because it reads the json output from the api
*
* and converts the json results into Java Objects (POJOs). So you don't have to do anything else yourself
*
* Now let us go ahead and see how you actually make the API call to get the results from the server;
*
* We can do that anywhere but it is good to put the calling in a special class - not that special.
* */
