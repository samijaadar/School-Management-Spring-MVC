/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.Controller;

import javax.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Sami
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    
    @GetMapping("/login")
    public String login(@PathParam("login") String login, @PathParam("password") String password){
        if (password.equalsIgnoreCase(login))return "home";
        else return "index";
    }
}
