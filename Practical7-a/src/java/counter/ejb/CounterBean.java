package counter.ejb;
import jakarta.ejb.Singleton;

@Singleton
public class CounterBean {
    private int hits =1;

    public int getHits(){
        return hits++;
    }
}