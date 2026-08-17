
import jakarta.servlet.AsyncContext;
import jakarta.servlet.ReadListener;
import jakarta.servlet.ServletInputStream;
import java.io.IOException;

/**
 *
 * @author Nirmal
 */
public class ReadingListener implements ReadListener{
    private ServletInputStream input = null;
    private AsyncContext ac = null;

    ReadingListener(ServletInputStream in, AsyncContext c){
        input = in;
        ac = c;
    }
    @Override
    public void onDataAvailable() throws IOException{
    }
    public void onAllDataRead() throws IOException{
        ac.complete();
    }
    public void onError(final Throwable t){
        ac.complete();
        t.printStackTrace();
    }

    

}
