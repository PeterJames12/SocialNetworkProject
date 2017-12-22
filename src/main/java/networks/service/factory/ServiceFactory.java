package networks.service.factory;

import networks.service.UserService;
import networks.service.impl.UserServiceImpl;

public class ServiceFactory {

    public static UserService getUserService() {
        return new UserServiceImpl();
    }
}
