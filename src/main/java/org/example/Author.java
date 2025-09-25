package org.example;

public class Author extends Base {
    private String name;
    int total_author_count = 0;

    Author(String name){
        this.name = name;
        total_author_count++;
        this.id = total_author_count;
    }

    String getName(){
        return name;
    }

    int getAuthorId(){
        return this.id;
    }

    void setName(String newName){
        this.name = newName;
    }

}
