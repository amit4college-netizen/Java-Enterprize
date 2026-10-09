package cart;

import java.util.List;
import jakarta.ejb.Local;

@Local
public interface CartBeanLocal {

    void initialize(String person, String id) throws Exception;

    void addBook(String title);

    void removeBook(String title) throws Exception;

    List<String> getContents();

    void remove();
}