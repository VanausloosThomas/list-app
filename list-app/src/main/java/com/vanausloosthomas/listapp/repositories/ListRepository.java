package com.vanausloosthomas.listapp.repositories;

import com.vanausloosthomas.listapp.list.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ListRepository extends JpaRepository<Listing,String> {

    @Override
    Optional<Listing> findById(String s);


}
