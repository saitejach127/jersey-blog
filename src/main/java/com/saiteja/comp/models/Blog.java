package com.saiteja.comp.models;

public class Blog {
    private int id;
    private String title;
    private String description;
    private String createdOn;

    public Blog(){
        
    }

    public Blog(int id, String title, String description, String createdOn){
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdOn = createdOn;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getCreatedOn(){
        return this.createdOn;
    }

    public void setCreatedOn(String createdOn){
        this.createdOn = createdOn;
    }


}