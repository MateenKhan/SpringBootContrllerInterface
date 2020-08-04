package com.example.restservice.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "errors")
public class ErrorConfig {

    public Map<String,String> messages;

    public Map<String,String> getMessages() {
        return messages;
    }

    public void setMessages(Map<String,String> messages) {
        this.messages = messages;
    }
}
