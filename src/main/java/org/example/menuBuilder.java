package org.example;

import java.util.ArrayList;

public class menuBuilder {

    public static void main(String[] args) {

        //menu title
        String menuTitle="DreamMenu";
        //print the menu title
        System.out.println("The menu title is: " + menuTitle);

        //create arraylist of menu items
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
        //add menu items to the arraylist

        //starters
        MenuItem starter1 = new MenuItem("Garlic Bread");
        menuItems.add(starter1);


        //main course
        MenuItem mainCourse1 = new MenuItem("Pizza");
        menuItems.add(mainCourse1);

        //desserts
        MenuItem dessert1 = new MenuItem("Ice Cream");
        menuItems.add(dessert1);

        //print the menu items
        System.out.println("The menu items are: " + menuItems);



    }
}
