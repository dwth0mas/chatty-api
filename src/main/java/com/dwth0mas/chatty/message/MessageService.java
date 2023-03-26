package com.dwth0mas.chatty.message;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;

    public ResponseEntity<Object> createMessage(Message message) {
        var savedMessage = messageRepository.save(message);
//                .orElseThrow();

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                        .buildAndExpand(savedMessage.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}
