package com.example.turistguide.controller;

import com.example.turistguide.model.TouristAttraction;
import com.example.turistguide.repository.TouristRepository;
import com.example.turistguide.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/attractions")
public class TouristController {


    private TouristService touristService;

    public TouristController() {
        this.touristService = new TouristService();
    }


    @GetMapping
    public ResponseEntity<String> attractions() {
        TouristRepository tr = new TouristRepository();
        return new ResponseEntity<>(tr.getDataList().toString(), HttpStatus.OK);
    }

    @GetMapping(path="/{name}") public ResponseEntity<String> name(@PathVariable String name) {
        return new ResponseEntity<>(name, HttpStatus.OK);
    }


    @PostMapping("/attractions/add") public ResponseEntity<String> add(String add) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

   @PostMapping("/attractions/update") public ResponseEntity<String> update(String update) {
        return new ResponseEntity<>(HttpStatus.OK);
   }

   @GetMapping("/attractions/delete/{name}") public ResponseEntity<String> delete() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
