
package net.nvcm.korzun.blz.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2017-03-31T14:46:53.855+02:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
public final class BLZServicePortType_BLZServiceSOAP12PortHttp_Client {

    private static final QName SERVICE_NAME = new QName("http://thomas-bayer.com/blz/", "BLZService");

    private BLZServicePortType_BLZServiceSOAP12PortHttp_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BLZService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BLZService ss = new BLZService(wsdlURL, SERVICE_NAME);
        BLZServicePortType port = ss.getBLZServiceSOAP12PortHttp();  
        
        {
        System.out.println("Invoking getBank...");
        java.lang.String _getBank_blz = "";
        net.nvcm.korzun.blz.client.DetailsType _getBank__return = port.getBank(_getBank_blz);
        System.out.println("getBank.result=" + _getBank__return);


        }

        System.exit(0);
    }

}
