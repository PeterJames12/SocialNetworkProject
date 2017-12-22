package networks.service;

import networks.dao.UserDao;
import networks.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public interface UserService {

    /**
     * @return list of all users.
     */
    List<User> getAll();

    /**
     * @return first user.
     */
    User getFirst();

    /**
     * @return user by given name.
     */
    List<User> getByName(String name);

    /**
     * @return user by age.
     */
    User getByAge(int age);

    void changePassword(User user, String newPassword);

    void happyBirthday(User user);
}
