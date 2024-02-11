package com.example.turistguide.model;

public class TouristAttraction {

    private String name;
    private String description;


    public TouristAttraction(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }


    public String toString() {
        return name + description;
    }
}
