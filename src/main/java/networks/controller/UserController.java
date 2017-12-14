package networks.controller;

import networks.model.User;
import networks.service.UserService;

import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class UserController {

    public static void main(String[] args) {

        final UserService userService = new UserService();
        List<User> users = userService.getAll();

        for (User elem : users) {
            System.out.println(elem);
        }

        System.out.println("All user printed");


        User firstUser = userService.getFirst();
        System.out.println(firstUser);
    }
}
