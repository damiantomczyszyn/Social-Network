package spring.summer.socialnetwork.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.summer.socialnetwork.dto.LoginDTO;
import spring.summer.socialnetwork.dto.TokenDTO;
import spring.summer.socialnetwork.services.LoginService;

@RestController
@RequestMapping("api/v1/login")
public class LoginController {

    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public ResponseEntity<TokenDTO> login(@RequestBody LoginDTO LoginDTO){return loginService.authenticate(LoginDTO);}



}
