package mypack;

import counter.ejb.VisitorCounter;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.jms.ConnectionFactory;
import jakarta.jms.JMSContext;
import jakarta.jms.Queue;

@Named("visitor")
@RequestScoped
public class visitor {

    @Inject
    private JMSContext context;

    @Resource(lookup = "jms/VisitorQueue")
    private Queue queue;

    @Inject
    private VisitorCounter counter;

    public void visit() {
        context.createProducer().send(queue, "visitor");
    }

    public int getCount() {
        return counter.getCount();
    }
}