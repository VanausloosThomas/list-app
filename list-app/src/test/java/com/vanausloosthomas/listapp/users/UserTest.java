package com.vanausloosthomas.listapp.users;

import org.junit.Test;

import static com.vanausloosthomas.listapp.users.User.UserBuilder.userBuilder;
import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {


    @Test
    public void userBuilder_givenMethodIsCalled_thenReturnsInstanceOfUserTestBuilder() {
        assertThat(userBuilder()).isInstanceOf(User.UserBuilder.class);
    }

    @Test
    public void build_givenMethodIsCalledOnUserBuilder_thenReturnsInstanceOfAUser() {
     assertThat(userBuilder().build()).isInstanceOf(User.class);
    }

    @Test
    public void build_givenUserBuilderWithProperties_thenReturnsUserWithSameProperties() {
        String firstName = "Thomas";
        String lastName = "Vanausloos";
        String username = "ThomasVanausloos";
        String password = "password";
        String email = "thomasvanausloos@gmail.com";

        User.UserBuilder userBuilder = userBuilder()
                .withFirstName(firstName)
                .withLastName(lastName)
                .withUsername(username)
                .withPassword(password)
                .withEmail(email);

        User builtUser = userBuilder.build();

        assertThat(builtUser).isNotNull();
        assertThat(builtUser).isInstanceOf(User.class);
        assertThat(builtUser.getFirstName()).isEqualTo(firstName);
        assertThat(builtUser.getLastName()).isEqualTo(lastName);
        assertThat(builtUser.getUsername()).isEqualTo(username);
        assertThat(builtUser.getPassword()).isEqualTo(password);
        assertThat(builtUser.getEmail()).isEqualTo(email);
    }
}