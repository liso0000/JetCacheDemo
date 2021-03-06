package com.test;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMethodCache(basePackages = "com.test")
@EnableCreateCacheAnnotation
public class JetCacheApp {
    public static void main(String[] args) {
        SpringApplication.run(JetCacheApp.class);
    }
}