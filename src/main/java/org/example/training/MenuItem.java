package org.example.training;

public class MenuItem {

    //item name
    String itemName;

    public MenuItem(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    //to string method
    @Override
    public String toString() {
        return getItemName();
    }

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Pizza");
        System.out.println(item1);
    }


}
