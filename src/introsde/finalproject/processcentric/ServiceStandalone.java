package introsde.finalproject.processcentric;

import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;
import javax.xml.ws.Endpoint;

public class ServiceStandalone {
    public static void main(String[] args) throws IllegalArgumentException, IOException, URISyntaxException{
        String PROTOCOL = "http://";
        String HOSTNAME = "0.0.0.0";
        String PORT = "7000";
        String BASE_URL = "/soap/processcentric";
        
        String endpointUrl = PROTOCOL+HOSTNAME+":"+PORT+BASE_URL;
        System.out.println("Starting Process Centric Service...");
        System.out.println("--> Published. Check out "+endpointUrl+"?wsdl");
        Endpoint.publish(endpointUrl, new ServiceImpl());
    }
}
