package ha;

import org.infinispan.manager.EmbeddedCacheManager;

import javax.annotation.Resource;
import javax.ejb.Stateless;

/**
 * Created by pawel.firlej on 2014-10-27.
 */
@Stateless
public class Service implements ServiceRemote {
//    @Resource(lookup = "java:jboss/infinispan/container/jdist")
//    EmbeddedCacheManager container;

    @Override
    public String sayHello() {
        return "Hello form " + System.getProperty("jboss.node.name");
    }

    @Override
    public void putToCache(String key, String value) {
        System.out.println(String.format("putToCache(key==>%s)", key));
//        container.getCache("jdist-cache").put(key, value);
    }

    @Override
    public String getFromCache(String key) {
        System.out.println(String.format("getFromCache(key==>%s)", key));
//        String value = (String) container.getCache("jdist-cache").get(key);
//        System.out.println(value);
//        return value;
        return "foo";
    }
}
