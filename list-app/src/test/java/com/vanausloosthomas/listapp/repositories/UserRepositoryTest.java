package com.vanausloosthomas.listapp.repositories;

import com.vanausloosthomas.listapp.IntegrationTest;
import com.vanausloosthomas.listapp.users.User;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import javax.inject.Inject;

import static com.vanausloosthomas.listapp.users.User.UserBuilder.userBuilder;

public class UserRepositoryTest extends IntegrationTest {

    @Inject
    private UserRepository userRepository;

    @Test
    public void save_whenSavingAUser_thenUserGetsPersisted() {
        User userToPersist = userBuilder()
                .withFirstName("Thomas")
                .withLastName("Vanausloos")
                .withUsername("ThomasVanausoos")
                .withPassword("password")
                .withEmail("thomasvanausloos@gmail.com")
                .build();

        userRepository.save(userToPersist);

        Assertions.assertThat(userRepository.findById(userToPersist.getId())).isPresent();
    }
}