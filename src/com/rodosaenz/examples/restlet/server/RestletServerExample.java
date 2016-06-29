package com.rodosaenz.examples.restlet.server;

import com.rodosaenz.examples.restlet.server.restlet.HelloRestlet;
import org.restlet.Server;
import org.restlet.data.Protocol;

public class RestletServerExample {

    public static void main(String[] args) throws Exception {

        // Avoid conflicts with other Java containers listening on 8080!
        // new Server(Protocol.HTTP, 8081, helloRestlet).start();
        
        Server server = new Server(Protocol.HTTP, 8081 );
        server.setAddress("127.0.0.1");
        
        /** Using Simple Reslet **/
        //HelloRestlet helloRestlet = new HelloRestlet();
        //server.setNext(helloRestlet);
        
        /** Using Reslet Application **/
        ResletApplicationExample applicationExample = new ResletApplicationExample();
        server.setNext(applicationExample);
        
        server.start();
        
    }
}
