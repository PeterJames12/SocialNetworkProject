package networks.controller;

import networks.config.EmailConfig;
import networks.model.User;
import networks.service.EmailBuilder;
import networks.service.UserService;
import networks.service.email.NewYearBuilder;
import networks.service.email.RecoverPasswordBuilder;
import networks.service.factory.ServiceFactory;
import networks.util.Car;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @author Igor Hnes on 06.12.17.
 */
public class UserController {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Igor");
        user.setEmail("joyukr@ukr.net");

        EmailBuilder emailBuilder = new NewYearBuilder();
        SimpleMailMessage message = emailBuilder.build(user);

        JavaMailSenderImpl javaMailSender = EmailConfig.mailSender();
        javaMailSender.send(message);


        UserService userService = ServiceFactory.getUserService();
    }

    private static void some(Car car) {
        if (car.equals(Car.HONDA)) {
            System.out.println("h");
        } else if (car.equals(Car.MAZDA)) {
            System.out.println("m");
        }
    }

}
