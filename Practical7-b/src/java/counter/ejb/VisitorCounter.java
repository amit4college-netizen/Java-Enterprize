package counter.ejb;

import jakarta.ejb.Stateless;

@Stateless
public class VisitorCounter {

    private int count = 0;

    public void addVisitor() {
        count++;
    }

    public int getCount() {
        return count;
    }
}