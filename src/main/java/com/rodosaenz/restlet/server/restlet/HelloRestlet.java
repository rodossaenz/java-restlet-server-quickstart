package com.rodosaenz.restlet.server.restlet;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.Restlet;
import org.restlet.data.MediaType;

public class HelloRestlet extends Restlet {

    public HelloRestlet(Context context) {
        super(context);
    }

    @Override
    public void handle(Request request, Response response) {
        response.setEntity("Hello there!", MediaType.TEXT_PLAIN);
    }
    
}
