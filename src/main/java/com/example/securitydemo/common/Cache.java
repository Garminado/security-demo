package com.example.securitydemo.common;

import com.example.securitydemo.entity.User;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.concurrent.TimeUnit;

/**
 * @author liujiaming
 * @since 2024-07-25
 */
public class Cache {

    private static final com.github.benmanes.caffeine.cache.Cache<String, User> cache = Caffeine.newBuilder()
            .expireAfterWrite(10, TimeUnit.MINUTES)
            .maximumSize(10_000)
            .build();

    public static void put(String key, User user) {
        cache.put(key, user);
    }

    public static User get(String key) {
        return cache.getIfPresent(key);
    }
}
