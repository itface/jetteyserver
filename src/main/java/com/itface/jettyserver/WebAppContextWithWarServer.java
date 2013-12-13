package com.itface.jettyserver;

import java.io.File;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class WebAppContextWithWarServer {

	public static void main(String[] args) throws Exception {  
        Server server = new Server(8080);  
        WebAppContext context = new WebAppContext();  
        context.setContextPath("/lottery");  
        String warpath = System.getProperty("user.dir")+File.separator+"lottery.war";
        context.setWar(warpath);  
        server.setHandler(context);  
        server.start();  
        server.join();  
    }  
}
