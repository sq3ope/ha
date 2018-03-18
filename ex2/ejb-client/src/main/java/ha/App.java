package ha;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws NamingException {

        System.out.println("Hello World!");

        final Context ctx = new InitialContext();
        for (int i = 0; i < 100; i++) {
            ServiceRemote sr = (ServiceRemote) ctx.lookup("ejb:ear-1.0-SNAPSHOT/ejb-1.0-SNAPSHOT/Service!ha.ServiceRemote");
            System.out.println(sr.sayHello());
        }

//        ServiceRemote sr = (ServiceRemote) ctx.lookup("ejb-1.0-SNAPSHOT/Service!ha.ServiceRemote");
//        sr.putToCache("k1", "w1");
//        sr.putToCache("k2", "w2");
//        sr.putToCache("k3", "w3");
//        sr.putToCache("k4", "w4");

//        System.out.println(String.format("getFromCache k1 %s", sr.getFromCache("k1")));
//        System.out.println(String.format("getFromCache k2 %s", sr.getFromCache("k2")));
//        System.out.println(String.format("getFromCache k3 %s", sr.getFromCache("k3")));
    }
}
