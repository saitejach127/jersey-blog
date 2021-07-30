package com.saiteja.comp.models;

import java.util.*;

public class Database{
    public static Map<Integer, Blog> db = new HashMap<Integer, Blog>();

    public static Map<Integer, Blog> getData(){
        return db;
    }

}