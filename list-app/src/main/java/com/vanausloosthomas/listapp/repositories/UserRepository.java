package com.vanausloosthomas.listapp.repositories;

import com.vanausloosthomas.listapp.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Override
    Optional<User> findById(String s);

}
