package com.dwth0mas.chatty.chat;

import com.dwth0mas.chatty.message.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chats")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @GetMapping
    public ResponseEntity<ChatResponse> getChat(String currentUserId, String friendUserId) {
        return  ResponseEntity.ok(chatService.getChat(currentUserId, friendUserId));
    }

}
