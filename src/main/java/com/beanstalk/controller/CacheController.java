package com.beanstalk.controller;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cache")
public class CacheController {

    private final Map<Integer, String> data = new HashMap<>();

    @Cacheable("data")
    @GetMapping("/{id}")
    public String getData(@PathVariable int id) {
        return data.computeIfAbsent(id, k -> "Value for ID " + k);
    }

    @CacheEvict("data")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> evictCache(@PathVariable int id) {
        data.remove(id);
        return ResponseEntity.ok("Cache evicted for ID " + id);
    }
}

