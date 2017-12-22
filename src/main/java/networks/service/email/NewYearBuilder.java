package networks.service.email;

import networks.model.User;
import networks.service.impl.EmailBuilderImpl;

public class NewYearBuilder extends EmailBuilderImpl {

    private final String SUBJECT = "Happy New Year";

    @Override
    public String subject() {
        return SUBJECT;
    }

    @Override
    public String text(User user) {
        return "Dear "
                + user.getName()
                + "Happy New Year";
    }

    @Override
    public String recipient(User user) {
        return user.getEmail();
    }
}
