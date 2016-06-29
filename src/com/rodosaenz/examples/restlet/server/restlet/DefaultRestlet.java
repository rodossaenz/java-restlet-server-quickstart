package com.rodosaenz.examples.restlet.server.restlet;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.Restlet;
import org.restlet.data.MediaType;

/**
 *
 * @author Rodolfo
 */
public class DefaultRestlet extends Restlet {

    public DefaultRestlet(Context context) {
        super(context);
    }

    @Override
    public void handle(Request request, Response response) {
        String entity = "Default Restlet!\n";
        entity += "\nMethod: " + request.getMethod()
                + "\nResource URI : "
                + request.getResourceRef()
                + "\nIP address: "
                + request.getClientInfo().getAddress()
                + "\nAgent name: "
                + request.getClientInfo().getAgentName()
                + "\nAgent version: "
                + request.getClientInfo().getAgentVersion();

        response.setEntity(entity, MediaType.TEXT_PLAIN);
    }

}
