package ha;

import javax.ejb.Remote;

/**
 * Created by pawel.firlej on 2014-10-27.
 */
@Remote
public interface ServiceRemote {
    String sayHello();

    void putToCache(String key, String value);

    String getFromCache(String key);
}
