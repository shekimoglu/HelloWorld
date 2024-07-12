package org.example;

import java.util.List;

public class Main {
    private static final ListManager listManager = new ListManager();

    public static void main(String[] args) {
        String command = System.getProperty("command");
        String items = System.getProperty("exec.args");

        if (command == null || command.isEmpty()) { return; }

        switch (command) {
            case "addItems" -> {
                if (items == null || items.isEmpty()) { return; }

                String[] itemsArray = items.split(" ");
                listManager.addItems(itemsArray);
            }
            case "removeItems" ->  {
                if (items == null || items.isEmpty()) { return; }
                String[] itemsArray = items.split(" ");
                List<String> list = listManager.removeItems(itemsArray);
                System.out.println(list.toString());
            }
            case "getList" ->  {
                System.out.println("getList");
                List<String> list = listManager.getList();
                System.out.println(list.toString());
            }
            case "sortList" ->  {
                System.out.println("sortList");
                List<String> list;

                if (items != null) {
                    list = listManager.sortList(true);
                }
                else {
                    list = listManager.sortList(false);
                }

                System.out.println(list.toString());
            }
            case "resetList" -> {
                System.out.println("resetList");
                listManager.resetList();
            }
        }
    }
}