package networks.service.email;

import networks.model.User;
import networks.service.impl.EmailBuilderImpl;

public class RecoverPasswordBuilder extends EmailBuilderImpl {

    private final String SUBJECT = "Recover password";

    @Override
    public String subject() {
        return SUBJECT;
    }

    @Override
    public String text(User user) {
        return "Dear "
                + user.getName()
                + " you recover password";
    }

    @Override
    public String recipient(User user) {
        return user.getEmail();
    }
}
