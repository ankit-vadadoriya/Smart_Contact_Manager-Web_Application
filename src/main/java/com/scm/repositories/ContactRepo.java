package com.scm.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.scm.entities.Contact;
import com.scm.entities.User;

@Repository
public interface ContactRepo extends JpaRepository<Contact, String> {

    // find contact by user

    // 1.custom find method
    Page<Contact> findByUser(User user, Pageable pageable);

    // 2. custom query method
    @Query("SELECT c FROM Contact c WHERE c.user.id = :userId")
    List<Contact> findByUserId(@Param("userId") String UserId);

    Page<Contact> findByNameContainingAndUser(String nameKeyword, User user, Pageable pageable);

    Page<Contact> findByEmailContainingAndUser(String emailKeyword, User user, Pageable pageable);
    
    Page<Contact> findByPhoneNumberContainingAndUser(String phoneNumberKeyword, User user, Pageable pageable);
}
