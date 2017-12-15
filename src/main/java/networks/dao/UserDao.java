package networks.dao;

import networks.data.Database;
import networks.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class UserDao {

    private static final int FIRST_INDEX = 0;

    public List<User> getAll() {
        return Database.getAllUsers();
    }

    public User getFirst() {
        return Database.getAllUsers().get(FIRST_INDEX);
    }

    public User getByName(String name) {
        List<User> users = getAll();
        for (User elem : users) {
            if (name.equals(elem.getName())) {
                return elem;
            }
        }
        return null;
    }
}
