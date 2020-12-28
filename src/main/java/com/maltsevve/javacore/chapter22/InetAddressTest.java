package main.java.com.maltsevve.javacore.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;

class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address = InetAddress.getByName("www.google.com");
        System.out.println(Address);

        InetAddress[] SW = InetAddress.getAllByName("www.codewars.com");
        for (InetAddress inetAddress : SW) System.out.println(inetAddress);
    }
}
