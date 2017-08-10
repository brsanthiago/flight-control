package br.com.brsantiago.flightcontrol.model.domain;


import javax.persistence.*;

/**
 * Created by bruno on 04/08/17.
 */
@Entity
public class Aircraft {
    @Id
    private int id;
    @Column(unique = true)
    private String code;
    private String name;
    private String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
