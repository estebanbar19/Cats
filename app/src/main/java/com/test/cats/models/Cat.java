package com.test.cats.models;

public class Cat {
    private String name;
    private String origin;
    private int affectionLevel;
    private int intelligence;
    private String reference_image_id;

    public Cat(String name, String origin, int affectionLevel, int intelligence, String reference_image_id) {
        this.name = name;
        this.origin = origin;
        this.affectionLevel = affectionLevel;
        this.intelligence = intelligence;
        this.reference_image_id = reference_image_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getAffectionLevel() {
        return affectionLevel;
    }

    public void setAffectionLevel(int affectionLevel) {
        this.affectionLevel = affectionLevel;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public String getReference_image_id() {
        return reference_image_id;
    }

    public void setReference_image_id(String reference_image_id) {
        this.reference_image_id = reference_image_id;
    }
}
