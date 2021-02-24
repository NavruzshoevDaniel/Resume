package ru.nsu.g.dnavruzshoev.resume;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.nsu.g.dnavruzshoev.resume.model.User;
import ru.nsu.g.dnavruzshoev.resume.repository.UserRepository;

import java.sql.Date;

@Component
public class Initializer implements CommandLineRunner {
    private final UserRepository userRepository;

    public Initializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = User.builder()
                .firstname("Daniel")
                .surname("Navruzshoev")
                .birthday(Date.valueOf("2020-05-31"))
                .email("d.navruzshoev@g.nsu.ru")
                .gender("Male")
                .experience(false)
                .password("cool")
                .patronymic("Arturovich")
                .build();

        userRepository.save(user);

    }

}