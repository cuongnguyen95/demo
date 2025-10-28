package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@Tag(name = "User", description = "User management APIs")
public class UserController {

    private static final Logger log = LogManager.getLogger(UserController.class);

    @GetMapping("/{id}")
    @Operation(summary = "Get user by ID", description = "Return user information")
    public String getUser(@PathVariable Long id) {
        log.info("Get user by ID{}", id);
        log.info("hehehehe");
        return "Cuong vua sua day";
    }
}
