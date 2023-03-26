package com.dwth0mas.chatty.message;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @PostMapping()
    public ResponseEntity<Object> createMessage(@RequestBody Message message) {
        return  ResponseEntity.ok(messageService.createMessage(message));
    }
}
