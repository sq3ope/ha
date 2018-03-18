package ha;

//import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by pawel.firlej on 2014-10-28.
 */
public class App2 {
    public static void main(String[] args) throws NamingException/*, JMSException*/ {
//        final Context context = new InitialContext();
//
//        ConnectionFactory cf = (ConnectionFactory) context.lookup("jms/RemoteConnectionFactory");
//
//        Queue queue = (Queue) context.lookup("jms/queue/test");
//
//        for (int i = 0; i < 10; i++) {
//            Connection connection = cf.createConnection("remoteuser", "password");
//
//            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//
//            MessageProducer publisher = session.createProducer(queue);
//
//            connection.start();
//
//            TextMessage message = session.createTextMessage(String.format("[%] Hallo AS 7.1", i));
//            publisher.send(message);
//            System.out.println("Message send into JMS provider");
//            session.close();
//            connection.close();
//        }
    }
}
