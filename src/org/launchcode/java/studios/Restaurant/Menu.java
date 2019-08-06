package org.launchcode.java.studios.Restaurant;

import java.util.Objects;

public class Menu {

    private double price;
    private String description;
    private String category;


    public Menu(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void addNewCategory(String newCategory){
        this.category = this.category + newCategory;
    }


    public String editDescription(String newWords){
        return newWords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu)) return false;
        Menu menu = (Menu) o;
        return Double.compare ( menu.getPrice ( ), getPrice ( ) ) == 0 &&
                Objects.equals ( getDescription ( ), menu.getDescription ( ) ) &&
                Objects.equals ( getCategory ( ), menu.getCategory ( ) );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( getPrice ( ), getDescription ( ), getCategory ( ) );
    }

    @Override
    public String toString() {
        return "Menu{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }



}
