package com.saiteja.comp.services;

import java.util.*;

import com.saiteja.comp.models.Blog;
import com.saiteja.comp.models.Database;

public class BlogService {
    Map<Integer, Blog> blogs = Database.getData();

    public List<Blog> getBlogs(){
        return new ArrayList<>(blogs.values());
    }

    public Blog getBlog(int id){
        return blogs.get(id);
    }

    public Blog addBlog(String title, String description, String createdOn){
        blogs.put(blogs.size() + 1, new Blog(blogs.size() + 1, title, description, createdOn));
        return blogs.get(blogs.size());
    }

}
