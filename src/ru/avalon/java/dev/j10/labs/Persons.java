package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;

public class Persons implements Person {
    
    private String name;
    private LocalDate data;

    public Persons(String name, LocalDate data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDate getBirthDate() {
        return data;
    }
    
    @Override
    public int compareTo(Object t) {
        Persons pers = (Persons) t;
        
        int result = name.compareTo(pers.name); 
        if (result !=0) {
            return result;
        }
        // Если имена одинаковые, персоны сортируются по дате рождения:
        result = data.compareTo(pers.data);
        
        return result;   
    }

    @Override
    public String toString() {
        return "Persons{" + "name=" + name + ", data=" + data + '}';
    }   
}
