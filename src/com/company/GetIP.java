package com.company;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Administrator
 * @date 2018/3/7 0007
 */
public class GetIP {
    public static void main(String[] args) {
        InetAddress address = null;

        try {
            address = InetAddress.getByName("oss.xuegaoqun.com");
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.exit(2);
        }
        System.out.println(address.getHostName() + "=" + address.getHostAddress());
        System.exit(0);
    }
}
