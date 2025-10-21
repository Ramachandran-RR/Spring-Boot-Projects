package com.chat.app.controller;

import com.chat.app.model.ChatMessege;
import org.apache.logging.log4j.message.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessege sendMessage(ChatMessege message) {
        return message;
    }

    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }
}
