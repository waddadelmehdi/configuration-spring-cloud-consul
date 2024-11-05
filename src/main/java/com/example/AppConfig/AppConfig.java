package com.example.AppConfig;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class AppConfig {
    @Value("${message:Default message}")
    private String message;

    public String getMessage() {
        return message;
    }
}
