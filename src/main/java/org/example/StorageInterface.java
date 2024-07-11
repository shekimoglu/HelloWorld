package org.example;

import java.util.List;

public interface StorageInterface {
        public List<String> read();
        public boolean append(String[] items);
        public boolean write(String[] items, boolean isAppend);
        public boolean delete();
        public void create();
}
