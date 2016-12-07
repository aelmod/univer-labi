package laba6;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by FreeFly on 07.12.2016.
 */
public class InetAddressResolver {
    public static String getInetAddrsByDomainName(String domainName) {
        try {
            String text = "";
            for (InetAddress inetAddress : InetAddress.getAllByName(domainName)) {
                text += inetAddress + "\n\r";
            }
            return text;
        } catch (UnknownHostException e) {
            return "Error";
        }
    }
}
