package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By ds on 2020/02/07.
 */

@RestController
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("hello");
    }

    @GetMapping("/home2")
    public ResponseEntity<String> home2() {
        return ResponseEntity.ok("world");
    }
}
