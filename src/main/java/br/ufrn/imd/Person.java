package br.ufrn.imd;

public class Person {
    public String name;
    public String hometown;

    public Person() {

    }

    public Person(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public String hometown(){
        return hometown;
    }

    public String name(){
        return name;
    }
}
