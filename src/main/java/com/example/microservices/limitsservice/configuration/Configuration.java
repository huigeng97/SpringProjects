package com.example.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    private int maximum;
    private int minimum;

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximun) {
        this.maximum = maximun;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
