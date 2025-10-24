package com.NotificationService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NotificationService.dto.EmailRequest;
import com.NotificationService.service.EmailSenderService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@AllArgsConstructor
@RequestMapping("api/notification")
public class MailController {
    @Autowired
    private final EmailSenderService emailSenderService;

    @PostMapping
    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request) {
        try {
            emailSenderService.sendEmail(request);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }

}
