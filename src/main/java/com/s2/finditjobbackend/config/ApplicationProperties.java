package com.s2.finditjobbackend.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
@Component
@Getter
@Setter
public class ApplicationProperties {

    private String outboundUrl;
}
