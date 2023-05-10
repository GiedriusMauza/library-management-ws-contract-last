package lt.viko.eif.gmauza.librarymanagementwscontractlast;

import javax.xml.ws.Endpoint;

public class LibraryServicePublisher {

    /**
     * The main method that publishes a LibraryService endpoint at http://localhost:8080/libraryservice.
     * Clients can access the WSDL file for this endpoint at http://localhost:8080/libraryservice?wsdl.
     *
     * @param args the command-line arguments, not used in this program
     */
    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8080/libraryservice", new LibraryServiceImpl());
    }
}
