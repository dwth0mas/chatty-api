package com.dwth0mas.chatty.chat;

import com.dwth0mas.chatty.auth.AuthenticationResponse;
import com.dwth0mas.chatty.message.Message;
import com.dwth0mas.chatty.message.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final MessageRepository messageRepository;

    public ChatResponse getMessages(String currentUserId, String friendUserId) {
        final Message[] messages = messageRepository.findByCurrentUserId(currentUserId, friendUserId)
                .orElseThrow();

        return ChatResponse.builder()
                .messages(messages)
                .build();
    }


}
