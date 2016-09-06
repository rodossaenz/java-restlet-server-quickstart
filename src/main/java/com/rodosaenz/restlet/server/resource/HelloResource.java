package com.rodosaenz.restlet.server.resource;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class HelloResource extends ServerResource {
    
    protected String name;
    
    @Override
    public void doInit() {
        this.name = getAttribute("name");
    }

    @Get("txt")
    public String fromGet() {
        return "Hello GET " + this.name;
    }
    
    @Post("txt")
    public String fromPost() {
        return "Hello POST " + this.name;
    }
  
}