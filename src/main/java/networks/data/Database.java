package networks.data;

import networks.model.Post;
import networks.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class Database {

    public static List<User> getAllUsers() {

        List<User> users = new LinkedList<>();

        final User user = new User("joyukr", "134", "Igor", 22, "Single");
        final User user2 = new User("joyukr", "134", "Alex", 22, "Single");
        final User user3 = new User("joyukr", "134", "Ann", 22, "Single");

        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;
    }

    public static Post[] getAllPosts() {
        Post posts[] = new Post[4];
        final Post post = new Post();
        posts[0] = post;

        return posts;
    }
}
