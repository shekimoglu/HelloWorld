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
        list = storage.read();
        return list;
    }

    public List<String> setList(String[] items){
        list = new ArrayList<>();
        return addItems(items);
    }

    public List<String> addItems(String[] items){
        list.addAll(List.of(items));
        storage.append(items);
        return list;
    }

    public List<String> removeItems(String[] items){
        list = storage.read();
        list.removeAll(List.of(items));
        storage.write(list.toArray(new String[0]), false);

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