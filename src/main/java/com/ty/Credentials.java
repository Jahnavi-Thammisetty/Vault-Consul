package com.ty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("jahnavi")
public class Credentials {

    private String username;
    private String password;
}
