package networks.dao.impl;

import networks.dao.UserDao;
import networks.data.Database;
import networks.model.User;

import java.util.LinkedList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private static final int FIRST_INDEX = 0;

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<User> getAll() {
        return Database.getAllUsers();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public User getFirst() {
        return Database.getAllUsers().get(FIRST_INDEX);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
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

    /**
     * {@inheritDoc}.
     */
    @Override
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
