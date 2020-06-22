package model;

import java.sql.Date;

public class Product {

    private String id;
    private String name;
    private String category;
    private float retail_price; // Giá bán lẻ
    private float entry_price;
    private String describe;
    private int product_number;
    private String note;
    private Date createAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCategory() {
        return category;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(int retail_price) {
        this.retail_price = retail_price;
    }

    public float getEntry_price() {
        return entry_price;
    }

    public void setEntry_price(int entry_price) {
        this.entry_price = entry_price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getProduct_number() {
        return product_number;
    }

    public void setProduct_number(int product_number) {
        this.product_number = product_number;
    }

    public String getNote() {
        return note;
    }

    public Date getCreateAt() {
        return createAt;
    }

}
