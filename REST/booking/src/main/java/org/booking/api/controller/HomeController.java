package org.booking.api.controller;

import org.booking.api.model.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Controller
public class HomeController {

    @CrossOrigin("*")
    @GetMapping("/home")
    public ResponseEntity<UserModel> home(@AuthenticationPrincipal OAuth2User principal) {
        if (principal != null) {
            UserModel userModel = new UserModel(UUID.randomUUID(), principal.getAttribute("name"), principal.getAttribute("email"));
            return ResponseEntity.ok(userModel);
        }
        else
            return ResponseEntity.ok(new UserModel(UUID.randomUUID(), "NULL", "NULL"));
    }

    @GetMapping("/")
    public String callback() {
        return "redirect:http://localhost:80";
    }
}