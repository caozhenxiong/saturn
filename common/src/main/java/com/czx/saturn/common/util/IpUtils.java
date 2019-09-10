package com.czx.saturn.common.util;

import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author caozhenxiong
 */
@Component
public class IpUtils {
    public String getLocalIp(){
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            if (inetAddress == null){
                return null;
            }
            return inetAddress.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }

}
