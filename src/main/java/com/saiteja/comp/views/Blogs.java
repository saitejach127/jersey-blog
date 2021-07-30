package com.saiteja.comp.views;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.fasterxml.jackson.annotation.JsonRawValue;

import com.saiteja.comp.models.Blog;
import com.saiteja.comp.services.BlogService;

@Path("blogs")
public class Blogs{

    BlogService bs = new BlogService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOneBlog(@DefaultValue("1") @QueryParam("id") int id){
        return Response.ok().entity(bs.getBlog(id)).build();
    }

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllBlogs(){
        return Response.ok().entity(bs.getBlogs()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @JsonRawValue
    public Response setNewBlog(Blog blog){
        System.out.println(blog.getTitle());
        bs.addBlog(blog.getTitle(), blog.getDescription(), blog.getCreatedOn());
        return Response.ok().entity(blog).build();
    }

}