package ru.nsu.g.dnavruzshoev.resume.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nsu.g.dnavruzshoev.resume.dto.UserDto;
import ru.nsu.g.dnavruzshoev.resume.service.UserService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@Slf4j
public class UserResumeController {

    private final UserService userService;

    @Autowired
    public UserResumeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getResumeUser(@PathVariable Long id) {
        log.info("Request to get user with {}", id);
        return userService.get(id)
                .map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<UserDto> updateResumeUser(@Valid @RequestBody UserDto user) {
        log.info("Request to update user with {}", user);
        userService.save(user);
        return ResponseEntity.ok().build();
    }
}
