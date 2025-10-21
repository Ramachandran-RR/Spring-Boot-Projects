package com.chat.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessege {
    private Long id;
    private String sender;
    private String content;
}
