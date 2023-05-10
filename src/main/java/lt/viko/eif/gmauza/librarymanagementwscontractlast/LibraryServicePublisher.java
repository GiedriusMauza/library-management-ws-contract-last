package lt.viko.eif.gmauza.librarymanagementwscontractlast;

import javax.xml.ws.Endpoint;

public class LibraryServicePublisher {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8080/libraryservice", new LibraryServiceImpl());
        // WSDL URL: http://localhost:8080/libraryservice?wsdl
    }
}
