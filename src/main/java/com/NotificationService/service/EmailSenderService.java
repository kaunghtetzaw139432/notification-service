package com.NotificationService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.NotificationService.dto.EmailRequest;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmailSenderService {
    @Autowired
    private JavaMailSender javaMailSender;
    @Value("{spring.mail.username}")
    private String senderEmail;

    public void sendEmail(EmailRequest request) {
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(senderEmail);
            mailMessage.setTo((request.getRecipientEmail()));
            mailMessage.setText(request.getMessage());
            mailMessage.setSubject(request.getSubject());
            javaMailSender.send(mailMessage);
           System.out.println("Email sent successfully");
        } catch (MailException e) {
            System.out.println(e.getMessage());
        }
    }

}
