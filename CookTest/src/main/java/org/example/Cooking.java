package org.example;

public class Cooking {
    public Cook menuCook(MenuItem menuItem) {
        Cook cook = new Cook(menuItem);
        return cook;
    }
}
