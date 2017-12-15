package networks.dao;

import networks.data.Database;
import networks.model.User;

import java.util.LinkedList;
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

    public List<User> getByName(String name) {
        List<User> users = getAll();
        List<User> usersByName = new LinkedList<>();
        for (User elem : users) {
            if (name.equals(elem.getName())) {
                usersByName.add(elem);
            }
        }
        return usersByName;
    }

    public User getByAge(int age) {
        List<User> users = getAll();

        for (User elem : users) {
            if (elem.getAge() == age) {
                return elem;
            }
        }
        return null;
    }
}
