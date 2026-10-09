package mypack;
import java.io.Serializable;
import counter.ejb.CounterBean;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.ConversationScoped;
import jakarta.inject.Named;
@Named("count")
@ConversationScoped
public class Count implements Serializable{
    @EJB
    private CounterBean counterBean;
    
    private int hitCount;
    
    public Count(){
        this.hitCount=0;
    }
    
    public int getHitCount(){
        hitCount = counterBean.getHits();
        return hitCount;
    }
    
    public void setHitCount(int newHits){
        this.hitCount = newHits;
    }
    
}