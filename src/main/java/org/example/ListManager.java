package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListManager {

    private List<String> list = new ArrayList<>();
    private StorageInterface storage;

    public ListManager(){
        storage = new FileManager("temp.txt");
    }

    public List<String> getList(){
        return list;
    }

    public List<String> setList(String[] items){
        list = new ArrayList<>();
        return addItems(items);
    }

    public List<String> addItems(String[] items){
        list.addAll(List.of(items));
        return list;
    }

    public List<String> removeItems(String[] items){
        for (String item : items) {
            list.remove(item);
        }

        return list;
    }

    public List<String> sortList(boolean ascending){
        list = storage.read();

        if (ascending){
            list.sort(Comparator.naturalOrder());
        }
        else {
            list.sort(Comparator.reverseOrder());
        }

        return list;
    }

    public void resetList(){
        storage.delete();
    }
}