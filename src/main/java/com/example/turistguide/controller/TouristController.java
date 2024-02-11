package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/attractions")
public class TouristController {

    @GetMapping(path="/{id}")public ResponseEntity<String> sayWelcome(@PathVariable int id) {
        return new ResponseEntity<Message>(welcomeService.getWelcomeMessage(id), HttpStatus.OK);
    }

}
