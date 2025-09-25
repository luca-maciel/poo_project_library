package org.example;

public class Author extends Base {
    private String name;
    int author_count = 0;

    Author(String name){
        this.name = name;
        author_count++;
        this.id = author_count;
    }

    String getName(){
        return name;
    }

}
