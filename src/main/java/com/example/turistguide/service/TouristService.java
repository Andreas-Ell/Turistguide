package com.example.turistguide.service;


import com.example.turistguide.repository.TouristRepository;
import org.springframework.stereotype.Service;

@Service
public class TouristService {

private TouristRepository touristRepository;

public TouristService() {
    touristRepository = new TouristRepository();
}


public List<Attractions> getAttractions() {
    return touristRepository.getAttractions();
}

public Attractions getAttractions(String name) {
    return touristRepository.getAttractions(name);
}

public Attractions post

}
