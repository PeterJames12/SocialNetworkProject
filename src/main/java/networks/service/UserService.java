package networks.service;

import networks.dao.UserDao;
import networks.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class UserService {

    public List<User> getAll() {
        final UserDao userDao = new UserDao();
        return userDao.getAll();
    }

    public User getFirst() {
        final UserDao userDao = new UserDao();
        return userDao.getFirst();
    }
}
