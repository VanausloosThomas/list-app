package com.vanausloosthomas.listapp.users;

import com.vanausloosthomas.listapp.general.NestedBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import static java.util.UUID.randomUUID;

@Entity
public class User {


    private static final String COLUMN_USER_ID = "USER_ID";
    private static final String COLUMN_FIRST_NAME = "FIRST_NAME";
    private static final String COLUMN_LAST_NAME = "LAST_NAME";
    private static final String COLUMN_USERNAME = "USERNAME";
    private static final String COLUMN_PASSWORD = "PASSWORD";
    private static final String COLUMN_EMAIL = "EMAIL";

    @Id
    @Column(name = COLUMN_USER_ID)
    private String id;

    @Column(name = COLUMN_FIRST_NAME)
    private String firstName;

    @Column(name = COLUMN_LAST_NAME)
    private String lastName;

    @Column(name = COLUMN_USERNAME)
    private String username;

    @Column(name = COLUMN_PASSWORD)
    private String password;

    @Column(name = COLUMN_EMAIL)
    private String email;

    private User() {
        this.id = randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public static class UserBuilder extends NestedBuilder<User> {

        public static UserBuilder userBuilder(){
            return new UserBuilder();
        }

        private UserBuilder() {
        }

        @Override
        public User createInstance() {
            return new User();
        }

        public UserBuilder withFirstName(String firstName) {
            instance().firstName = firstName;
            return this;
        }

        public UserBuilder withLastName(String lastName) {
            instance().lastName = lastName;
            return this;
        }

        public UserBuilder withUsername(String username) {
            instance().username = username;
            return this;
        }

        public UserBuilder withPassword(String password) {
            instance().password = password;
            return this;
        }

        public UserBuilder withEmail(String email) {
            instance().email = email;
            return this;
        }

    }
}