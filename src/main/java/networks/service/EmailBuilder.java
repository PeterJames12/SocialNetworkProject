package networks.service;

import networks.model.User;
import org.springframework.mail.SimpleMailMessage;

public interface EmailBuilder {

    SimpleMailMessage build(User user);
}
