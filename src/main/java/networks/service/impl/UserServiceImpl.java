package networks.service.impl;

import networks.dao.UserDao;
import networks.dao.impl.UserDaoImpl;
import networks.model.User;
import networks.service.MessageService;
import networks.service.UserService;
import networks.service.email.RecoverPasswordBuilder;

import java.time.LocalDate;
import java.util.List;

public class UserServiceImpl implements UserService {

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<User> getAll() {
        final UserDao userDao = new UserDaoImpl();
        return userDao.getAll();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public User getFirst() {
        final UserDao userDao = new UserDaoImpl();
        return userDao.getFirst();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<User> getByName(String name) {
        final UserDao userDao = new UserDaoImpl();
        return userDao.getByName(name);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public User getByAge(int age) {
        final UserDao userDao = new UserDaoImpl();
        return userDao.getByAge(age);
    }

    @Override
    public void changePassword(User user, String newPassword) {
        user.setPassword(newPassword);
//        MessageBuilder builder = new RecoverPasswordBuilder();
//        String message = builder.build(user);
        MessageService messageService = new MessageServiceImpl();
//        messageService.sendMessage(message, user.getEmail());
    }

    @Override
    public void happyBirthday(User user) {
        if (user.getBirthday().equals(LocalDate.now())) {

        }
    }
}
