package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/invite")
public class InviteController {
    private final JavaMailSender mailSender;

    @Autowired
    public InviteController(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @PostMapping
    public ResponseEntity<String> inviteEmployee(
            @RequestParam("email") String email,
            @RequestParam("activationLink") String activationLink) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("You're Invited to Mercor Time-Tune");
        message.setText("Hello,\n\nYou have been invited to join Mercor Time-Tune. Please use the following link to activate your account and download the desktop app: " + activationLink);
        mailSender.send(message);
        return ResponseEntity.ok("Invitation sent to " + email);
    }
}
