package co.ke.echirchir.dwellerz.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tenant{

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long Id;

    public Tenant(){}

}