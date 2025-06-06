package com.ecommerce.product.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "product-config")
@Component
@Getter
@Setter
public class ProductConfigInfoDto {

    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
    private Map<String, String> serverDetails;


}
