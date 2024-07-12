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
    //Create setList() method has not been implemented. When provided a list of items, it will replace the entire contents of the list if there is at least one item.Otherwise, it should do nothing.


    public List<String> setList(String[] items){
        list = List.of(items);
        storage.write(items, false);
        return list;
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