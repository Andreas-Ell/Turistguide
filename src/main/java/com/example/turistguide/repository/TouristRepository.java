package com.example.turistguide.repository;


import com.example.turistguide.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TouristRepository {



    ArrayList<TouristAttraction> data = new ArrayList<>();

    TouristAttraction t1 = new TouristAttraction("Tivoli", "park");
    TouristAttraction t2 = new TouristAttraction("Zoo", "park");
    TouristAttraction t3 = new TouristAttraction("Bakken", "park");

    public void addToData() {
        data.add(t1);
        data.add(t2);
        data.add(t3);
    }

    public ArrayList<TouristAttraction> getDataList() {
        return data;
    }



}
