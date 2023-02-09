package com.daneking.chat;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    private Bot bot;

    public ChatController(Bot bot) {
        this.bot = bot;
    }

    @GetMapping("/chat/{msg}")
    public String getMessage(@PathVariable String msg){
        Chat chatSession=new Chat(bot);
        return "It works: " + chatSession.multisentenceRespond(msg);
    }
}
