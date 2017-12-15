package networks.controller;

import networks.exception.NoFoundUserException;
import networks.model.User;
import networks.service.UserService;

import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class UserController {

    public static void main(String[] args) {

        if (true) {
            throw new NoFoundUserException();
        }
    }
}
