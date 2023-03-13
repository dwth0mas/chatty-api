package com.dwth0mas.chatty.message;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MessageRepository extends JpaRepository<Message, Integer> {

    Optional<Message[]> findByCurrentUserId(String currentUserId, String friendUserId);

}
