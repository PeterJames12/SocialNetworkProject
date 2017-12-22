package networks.dao;

import networks.data.Database;
import networks.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public interface UserDao {

    /**
     * @return list of all users.
     */
    List<User> getAll();

    /**
     * @return first user.
     */
    User getFirst();

    /**
     * @return list of users by name.
     */
    List<User> getByName(String name);

    /**
     * @return user by age.
     */
    User getByAge(int age);
}
