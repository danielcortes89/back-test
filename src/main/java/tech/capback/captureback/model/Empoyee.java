package tech.capback.captureback.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Empoyee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;

    public Empoyee(){}

    public Empoyee(String name){
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
