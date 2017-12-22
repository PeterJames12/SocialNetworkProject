package networks.service.impl;

import networks.model.User;
import networks.service.EmailBuilder;
import org.springframework.mail.SimpleMailMessage;

public abstract class EmailBuilderImpl implements EmailBuilder {

    @Override
    public SimpleMailMessage build(User user) {
        SimpleMailMessage message = buildProperties();
        message.setSubject(this.subject());
        message.setText(this.text(user));
        message.setTo(this.recipient(user));
        return message;
    }

    private SimpleMailMessage buildProperties() {
        SimpleMailMessage message = new SimpleMailMessage();
        String sender = "Igor";
        message.setFrom(sender);
        return message;
    }

    public abstract String subject();

    public abstract String text(User user);

    public abstract String recipient(User user);
}
