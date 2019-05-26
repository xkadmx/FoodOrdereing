package com.example.foodordereing;

public class Food {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Food[] food={
            new Food("Sushi", "Przykładowe podanie porcji dania.", R.drawable.foodapp_th),
            new Food("Robaki", "Przykładowe podanie robaków na talerzu", R.drawable.foodapp_ui),
            new Food("Bezpieczna saładka", "Klasyczny bezpieczny wybór bez wtopy.", R.drawable.foodapp_wj)
    };
    private Food(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public String toString(){
        return this.name;
    }
}
