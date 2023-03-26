package com.dwth0mas.chatty.chat;

import com.dwth0mas.chatty.auth.AuthenticationResponse;
import com.dwth0mas.chatty.message.Message;
import com.dwth0mas.chatty.message.MessageRepository;
import com.dwth0mas.chatty.message.MessageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final MessageRepository messageRepository;
    private List<String> list = new ArrayList<String>();
    public Set<String> stringSet = new LinkedHashSet<String>();

    public ChatResponse getChat(String userId, String friendId) {
        final Message[] messages = messageRepository.findByUserIdAndFriendId(userId, friendId)
                .orElseThrow();

        return ChatResponse.builder()
                .messages(messages)
                .build();
    }

}
