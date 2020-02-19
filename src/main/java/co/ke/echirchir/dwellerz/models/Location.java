package co.ke.echirchir.dwellerz.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location{

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long Id;

    private String name;

    public Location(){}

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}