package com.bridgelabz.EAMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("rs7442726@gmail.com"); 
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        
        mailSender.send(message);
    }
}
