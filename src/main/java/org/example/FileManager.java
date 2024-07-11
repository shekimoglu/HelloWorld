package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager implements StorageInterface{
    private String fileName = "temp.txt";
    File file;

    public FileManager(String fileName) {
        this.fileName = fileName;
        this.create();
    }

    public List<String> read(){
        ArrayList<String> list = new ArrayList<>();

        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                list.add(data);
                System.out.println(data);
            }

            reader.close();
            return list;
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR unable to read file");
        }

        return new ArrayList<>();
    }

    public boolean append(String[] items){
        return write(items, true);
    }

    public boolean write(String[] items, boolean isAppend){
        try {
            FileWriter fw = new FileWriter(fileName, isAppend);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String item : items) {
                bw.write(item);
                bw.newLine();
            }

            bw.close();

            return true;
        } catch (IOException e) {
            System.out.println("ERROR unable to write to file.");
        }

        return false;
    }

    public void create(){
        file = new File(fileName);

        try {

            if (file.createNewFile()) {
                System.out.println("INFO File created: " + file.getName());
            } else {
                System.out.println("WARN file " + file.getName() + " already exists.");
            }
        } catch (IOException e) {
            System.out.println("ERROR during file creation.");
            e.printStackTrace();
        }
    }

    public boolean delete(){
        if (file.delete()) {
            System.out.println("INFO Deleted file " + file.getName());
            return true;
        }
        else {
            System.out.println( "ERROR unable to delete " + file.getName());
            return false;
        }
    }
}