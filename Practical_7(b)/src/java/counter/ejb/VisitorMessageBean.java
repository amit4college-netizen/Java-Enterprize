package counter.ejb;

import jakarta.ejb.ActivationConfigProperty;
import jakarta.ejb.EJB;
import jakarta.ejb.MessageDriven;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;

@MessageDriven(
    activationConfig = {
        @ActivationConfigProperty(
            propertyName = "destinationType",
            propertyValue = "jakarta.jms.Queue"
        ),
        @ActivationConfigProperty(
            propertyName = "destinationLookup",
            propertyValue = "jms/VisitorQueue"
        )
    }
)
public class VisitorMessageBean implements MessageListener {

    @EJB
    private VisitorCounter counter;

    @Override
    public void onMessage(Message message) {
        counter.addVisitor();
    }
}