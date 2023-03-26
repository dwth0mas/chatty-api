package com.dwth0mas.chatty.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponse {
    private Integer id;
    private String message;
    private Date dateSent;
    private Integer currentUserId;
    private Integer friendUserId;
}
