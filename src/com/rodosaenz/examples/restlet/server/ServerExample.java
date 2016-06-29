package com.rodosaenz.examples.restlet.server;

import com.rodosaenz.examples.restlet.server.restlet.HelloRestlet;
import org.restlet.Server;
import org.restlet.data.Protocol;

public class ServerExample {

    public static void main(String[] args) throws Exception {

        
        Server server = new Server(Protocol.HTTP, 8081 );
        server.setAddress("127.0.0.1");
        
        /** Using Simple Reslet **/
        //HelloRestlet helloRestlet = new HelloRestlet();
        //server.setNext(helloRestlet);
        
        /** Using The Reslet Application **/
        ApplicationExample applicationExample = new ApplicationExample();
        server.setNext(applicationExample);
        
        server.start();
        
    }
}
