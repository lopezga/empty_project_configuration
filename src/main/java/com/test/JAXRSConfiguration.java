package com.test;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("app") // si no funciona, cambiar a "resources"
public class JAXRSConfiguration extends Application {

}
