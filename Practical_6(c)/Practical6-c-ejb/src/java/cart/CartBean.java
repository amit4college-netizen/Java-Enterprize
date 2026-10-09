package cart;

import java.util.ArrayList;
import java.util.List;
import jakarta.ejb.Remove;
import jakarta.ejb.Stateful;

@Stateful
public class CartBean implements CartBeanLocal {

    String customerName;
    String customerId;
    List<String> contents;

    public void initialize(String person, String id) throws Exception {

        if (person == null || id == null) {
            throw new Exception("Name or ID cannot be null.");
        }

        if (person.equals("ABC") && id.equals("123")) {
            customerName = person;
            customerId = id;
            contents = new ArrayList<String>();
        } else {
            throw new Exception("Invalid name or ID.");
        }
    }

    public void addBook(String title) {
        contents.add(title);
    }

    public void removeBook(String title) throws Exception {
        boolean result = contents.remove(title);

        if (!result) {
            throw new Exception(title + " not in cart.");
        }
    }

    public List<String> getContents() {
        return contents;
    }

    @Remove
    public void remove() {
        contents = null;
    }
}