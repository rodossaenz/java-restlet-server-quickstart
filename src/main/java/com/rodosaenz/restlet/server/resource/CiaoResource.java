package com.rodosaenz.restlet.server.resource;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

public class CiaoResource extends HelloResource {
    
    private String message;
    
    @Override
    public void doInit() {
        super.doInit();
        this.message = getAttribute("message");
    }

    @Get("txt")
    public String fromGet() {
        return "Ciao GET " + this.name + " " + this.message;
    }
    
    @Post("txt")
    public String fromPost() {
        return "Ciao POST " + this.name + " " + this.message;
    }
  
}